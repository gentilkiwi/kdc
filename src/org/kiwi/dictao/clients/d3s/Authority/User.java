package org.kiwi.dictao.clients.d3s.Authority;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import org.kiwi.dictao.clients.HttpsWebServiceClient;
import org.kiwi.dictao.webservices.d3s.Authority.Authority;
import org.kiwi.dictao.webservices.d3s.Authority.UserPort;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

public class User extends HttpsWebServiceClient{

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
            
            UserPort monPort = monAuthority.getUserPort();
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
        User monAppel = new User();
        monAppel.parseAndRun(args);
    }
}
