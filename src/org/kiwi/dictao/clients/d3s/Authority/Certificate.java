package org.kiwi.dictao.clients.d3s.Authority;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import org.kiwi.dictao.clients.HttpsWebServiceClient;
import org.kiwi.dictao.webservices.d3s.Authority.Authority;
import org.kiwi.dictao.webservices.d3s.Authority.CertificatePort;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

public class Certificate extends HttpsWebServiceClient{

    @Override
    public void parseAndRun(String[] arguments) {
        CmdLineParser monParseur = new CmdLineParser(this);

        try {
            super.parseAndRun(arguments);
            monParseur.parseArgument(arguments);

            if(wsdlUri == null) {
                wsdlUri = getClass().getResource("v2_1_Authority.wsdl");
            }

            Authority monAuthority = new Authority(wsdlUri, new QName("http://www.dictao.com/d3s/wsdl/v2/Authority", "Authority"));
            
            CertificatePort monPort = monAuthority.getCertificatePort();
            beginCall((BindingProvider) monPort);
//            monPort.
            endCall();

//            System.out.println(new Resultat(maReponse));

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
        Certificate monAppel = new Certificate();
        monAppel.parseAndRun(args);
    }
}
