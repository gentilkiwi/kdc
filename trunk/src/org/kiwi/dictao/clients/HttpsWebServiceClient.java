package org.kiwi.dictao.clients;

import java.io.File;
import java.io.IOException;
import org.kohsuke.args4j.*;

public class HttpsWebServiceClient extends HttpWebServiceClient {
    @Option(name = "--keystore", required = false, usage = "(optionnel) Certificat de connexion au WebService")
    protected File keystoreFile = null;
    @Option(name = "--keystore-type", required = false, usage = "(optionnel) Type de certificat de connexion au WebService (JKS/PKCS12)")
    protected String keystoreType = "JKS";
    @Option(name = "--keystore-pass", required = false, usage = "(optionnel) Mot de passe du catalogue de certificat de confiance pour le serveur")
    protected String keystorePass = "changeit";
    @Option(name = "--truststore", required = false, usage = "(optionnel) Catalogue de certificats de confiance (TrustStore au format JKS)")
    protected File truststoreFile = null;

    @Override
    public void parseAndRun(String[] arguments) throws CmdLineException, IOException {
        super.parseAndRun(arguments);

        CmdLineParser monParseur = new CmdLineParser(this);
        monParseur.parseArgument(arguments);

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
    }
}
