package org.kiwi.dictao.clients.dvs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.kiwi.dictao.clients.HttpsWebServiceClient;
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
import java.math.BigInteger;
import java.util.Vector;
import org.kiwi.utils.Connections;
import org.kiwi.utils.Affichages;

public class ocsp extends HttpsWebServiceClient {
    @Option(name = "--certificat", required = true, usage = "Certificat à vérifier")
    private File certFile = null;
    
    @Option(name = "--issuer-file", required = true, usage = "Emetteur du certificat à vérifier")
    private File issuerFile = null;
    
    @Option(name = "--ca-file", required = false, usage = "(optionnel) Emetteur du certificat de signature OCSP")
    private File caFile = null;
    @Option(name = "--va-file", required = false, usage = "(optionnel) Certificat publique de signature OCSP")
    private File vaFile = null;

    @Override
    public void parseAndRun(String[] arguments) {
        CmdLineParser monParseur = new CmdLineParser(this);
        Security.addProvider(new BouncyCastleProvider());
        
        try {
            super.parseAndRun(arguments);
            monParseur.parseArgument(arguments);

            BigInteger certSerial = Affichages.getAndDisplayCertificate(certFile, "Certificat à vérifier").getSerialNumber();
            X509Certificate issuerCertif = Affichages.getAndDisplayCertificate(issuerFile, "Certificat émetteur");
            
            PublicKey maCleDeValidation = null;
            if (vaFile != null) {
                maCleDeValidation = Affichages.getAndDisplayCertificate(vaFile, "Certificat de signature OCSP (validation)").getPublicKey();
            }
            
            X509Certificate monCertificatEmeteurSignature = null;
            if( caFile != null) {
                monCertificatEmeteurSignature = Affichages.getAndDisplayCertificate(caFile, "Certificat émetteur de signature OCSP (validation)");
            }

            CertificateID id = new CertificateID(CertificateID.HASH_SHA1, issuerCertif, certSerial);

            System.out.println("\nRequête OCSP\n============");
            OCSPReqGenerator generator = generateOCSPRequest();
            generator.addRequest(id);
            OCSPReq requete = generator.generate();

            beginCall(null);
            OCSPResp maReponse = new OCSPResp(Connections.getMyResponse(wsUri, requete.getEncoded(), "application/ocsp-request", "application/ocsp-response"));
            endCall();
            
            System.out.println(new Resultat(maReponse, maCleDeValidation, monCertificatEmeteurSignature));

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

    public static void main(String[] args) {
        ocsp monAppel = new ocsp();
        monAppel.parseAndRun(args);
    }
}
