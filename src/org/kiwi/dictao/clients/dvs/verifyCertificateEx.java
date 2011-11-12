package org.kiwi.dictao.clients.dvs;

import org.kiwi.dictao.webservices.dvs.*;
import org.kiwi.dictao.clients.StandardWebService;
import org.kiwi.dictao.responses.dvs.verifyCertificateEx.Resultat;

import org.kohsuke.args4j.*;
import org.kiwi.utils.Base64;

import java.io.File;
import java.io.FileInputStream;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.UnknownHostException;
import java.security.cert.CertificateException;
import java.util.List;

public class verifyCertificateEx extends StandardWebService{
    @Option(name = "--refreshCRLs", required = false, usage = "(optionnel) Force le serveur à re-télécharger les CRL avant traitement")
    private boolean refreshCRLs = false;
    @Option(name = "--plugin", multiValued= true, required = false, usage = "(optionnel) plugin à utiliser")
    private List<String> plugin = null;

    @Option(name = "--certificat", required = true, usage = "Certificat à valider")
    private File certificat = null;

    @Override
    public void parseAndRun(String[] arguments) {
        CmdLineParser monParseur = new CmdLineParser(this);

        try {
            super.parseAndRun(arguments);
            monParseur.parseArgument(arguments);

            if(wsdlUri == null) {
                wsdlUri = getClass().getResource("DVSInterfaceFrontEnd.wsdl");
            }

            System.out.println("refreshCRLs   : " + refreshCRLs);
            System.out.println("certificat    : " + certificat.getPath());

            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            InputStream inStream = new FileInputStream(certificat);
            X509Certificate inCertif = (X509Certificate) cf.generateCertificate(inStream);
            inStream.close();
            String strCertificat = Base64.encodeBytes(inCertif.getEncoded());

            System.out.println("certificat(i) : " + inCertif.getSubjectDN() + " (sn : " + inCertif.getSerialNumber() + '/' + inCertif.getSerialNumber().toString(16) + ")");
            System.out.println("certificat(i2): " + inCertif.getNotBefore() + " -> " + inCertif.getNotAfter());
            System.out.println("emeteur       : " + inCertif.getIssuerDN());

            System.out.println();

            ArrayOfPluginParameterStruct mesParamsPlugins = new ArrayOfPluginParameterStruct();
            if(plugin != null) {
                for(String monPlugin : plugin) {
                    PluginParameterStruct monParam = new PluginParameterStruct();
                    System.out.println("Plugin : " + monPlugin);
                    monParam.setLabel(monPlugin);
                    monParam.setData("");
                    mesParamsPlugins.getPluginParameterStruct().add(monParam);
                }
            }

            DVS monDVS = new DVS(wsdlUri, new QName("http://www.dictao.com/DVS/Interface", "DVS"));
            DVSSoap monPort = monDVS.getDVSSoap();
            beginCall((BindingProvider) monPort);
            DVSResponseEx maReponse = monPort.verifyCertificateEx(requestId, transactionId, (refreshCRLs ? 1 : 0), tag, strCertificat, mesParamsPlugins);
            endCall();

            System.out.println(new Resultat(maReponse));

        } catch (CertificateException ex) {
            System.err.println("Erreur de certificat : " + ex.getMessage());
        } catch (CmdLineException ex) {
            System.err.println("Erreur : " + ex.getMessage());
            monParseur.printUsage(System.err);
        } catch (UnknownHostException ex) {
            System.err.println("Erreur de résolution du nom de machine : " + ex.getMessage());
        } catch (FileNotFoundException ex) {
            System.err.println("Erreur de lecture du fichier : " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Erreur d\'E/S : " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        verifyCertificateEx monAppel = new verifyCertificateEx();
        monAppel.parseAndRun(args);
    }
}
