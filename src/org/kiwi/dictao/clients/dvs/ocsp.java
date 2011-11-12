package org.kiwi.dictao.clients.dvs;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.kiwi.dictao.clients.HttpWebServiceClient;
import org.kiwi.dictao.responses.dvs.ocsp.Resultat;
import org.kohsuke.args4j.*;

import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.ocsp.OCSPObjectIdentifiers;
import org.bouncycastle.asn1.x509.X509Extension;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.ocsp.*;

import java.security.PublicKey;
import java.security.Security;
import java.security.cert.*;
//import java.io.*;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Vector;

public class ocsp extends HttpWebServiceClient {
    @Option(name = "--keystore", required = false, usage = "(optionnel) Certificat de connexion au serveur OCSP")
    protected File keystoreFile = null;
    @Option(name = "--keystore-type", required = false, usage = "(optionnel) Type de certificat de connexion au serveur OCSP (JKS/PKCS12)")
    protected String keystoreType = "JKS";
    @Option(name = "--keystore-pass", required = false, usage = "(optionnel) Mot de passe du catalogue de certificat de confiance pour le serveur")
    protected String keystorePass = "changeit";
    @Option(name = "--truststore", required = false, usage = "(optionnel) Catalogue de certificats de confiance (TrustStore au format JKS)")
    protected File truststoreFile = null;

    @Option(name = "--certificat", required = true, usage = "Certificat à vérifier")
    private File certFile = null;
    @Option(name = "--ca-file", required = true, usage = "Emetteur du certificat à vérifier")
    private File caFile = null;
    @Option(name = "--va-file", required = false, usage = "(optionnel) Certificat publique du serveur OCSP")
    private File vaFile = null;

    @Override
    public void parseAndRun(String[] arguments) {
        CmdLineParser monParseur = new CmdLineParser(this);

        try {
            super.parseAndRun(arguments);
            monParseur.parseArgument(arguments);

            Security.addProvider(new BouncyCastleProvider());

            if(truststoreFile != null)
            {
                System.setProperty("javax.net.ssl.trustStore", truststoreFile.getCanonicalPath());
            }

            if(keystoreFile != null)
            {
                System.setProperty("javax.net.ssl.keyStore", keystoreFile.getCanonicalPath());
                System.setProperty("javax.net.ssl.keyStorePassword", keystorePass);
                System.setProperty("javax.net.ssl.keyStoreType", keystoreType);
            }

            BigInteger certSerial = getAndDisplayCertificate(certFile, "Certificat à vérifier").getSerialNumber();
            X509Certificate issuerCertif = getAndDisplayCertificate(caFile, "Certificat émetteur");
            
            PublicKey maCleDeValidation = null;
            if (vaFile != null) {
                maCleDeValidation = getAndDisplayCertificate(vaFile, "Certificat de signature OCSP (validation)").getPublicKey();
            }

            CertificateID id = new CertificateID(CertificateID.HASH_SHA1, issuerCertif, certSerial);

            System.out.println("\nRequête OCSP\n------------");
            OCSPReqGenerator gen = generateOCSPRequest();
            gen.addRequest(id);
            OCSPReq requete = gen.generate();
            System.out.println("URL du serveur OCSP        : " + wsUri);

            beginCall(null);
            OCSPResp maReponse = getMyResponse(wsUri, requete);
            endCall();
            
            System.out.println(new Resultat(maReponse, maCleDeValidation));


        } catch (CmdLineException ex) {
            System.err.println("Erreur : " + ex.getMessage());
            monParseur.printUsage(System.err);
        } catch (OCSPException ex) {
            System.err.println("Erreur OCSP : " + ex.getMessage());
        } catch (CertificateException ex) {
            System.err.println("Erreur de certificat : " + ex.getMessage());
        } catch (FileNotFoundException ex) {
            System.err.println("Erreur de lecture du fichier : " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Erreur d\'E/S : " + ex.getMessage());
        }
    }

    public static X509Certificate getAndDisplayCertificate(File monFichier, String description) throws FileNotFoundException, CertificateException, IOException
    {
        CertificateFactory cf = CertificateFactory.getInstance("X.509");
        InputStream inStream = new FileInputStream(monFichier);
        X509Certificate inCertif = (X509Certificate) cf.generateCertificate(inStream);
        inStream.close();

        System.out.println('\n' + description  + '\n' + new String(new char[description.length()]).replace('\0', '='));
        System.out.println("Fichier certificat : " + monFichier);
        System.out.println("DN certificat      : " + inCertif.getSubjectDN());
        System.out.println("Validité           : " + inCertif.getNotBefore() + " -> " + inCertif.getNotAfter());
        System.out.println("Numéro de série    : " + inCertif.getSerialNumber());
        System.out.println("Emetteur           : " + inCertif.getIssuerDN());

        return inCertif;
    }


    public static OCSPReqGenerator generateOCSPRequest() {

        OCSPReqGenerator gen = new OCSPReqGenerator();
        BigInteger nonce = BigInteger.valueOf(System.currentTimeMillis());
        Vector oids = new Vector();
        Vector values = new Vector();
        oids.add(OCSPObjectIdentifiers.id_pkix_ocsp_nonce);
        values.add(new X509Extension(false, new DEROctetString(nonce.toByteArray())));
        gen.setRequestExtensions(new X509Extensions(oids, values));

        return gen;
    }

    public static OCSPResp getMyResponse(URL ocspAddr, OCSPReq maRequete) throws IOException {

        HttpURLConnection con = (HttpURLConnection) ocspAddr.openConnection();
        con.setRequestProperty("Content-Type", "application/ocsp-request");
        con.setRequestProperty("Accept", "application/ocsp-response");
        con.setDoOutput(true);
        OutputStream out = con.getOutputStream();
        DataOutputStream dataOut = new DataOutputStream(new BufferedOutputStream(out));
        dataOut.write(maRequete.getEncoded());
        dataOut.flush();
        dataOut.close();

        System.out.println("Code retour HTTP           : " + con.getResponseCode());
        InputStream in = (InputStream) con.getContent();

        return new OCSPResp(in);
    }

    public static void main(String[] args) {
        ocsp monAppel = new ocsp();
        monAppel.parseAndRun(args);
    }
}
