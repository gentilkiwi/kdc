package org.kiwi.dictao.clients;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

public class StandardWebService extends HttpsWebServiceClient {

    @Option(name = "--requestId", required = false, usage = "(optionnel) Identifiant de la requête")
    protected String requestId = null;
    @Option(name = "--transactionId", required = true, usage = "Identifiant de la transaction à utiliser")
    protected String transactionId = null;
    @Option(name = "--tag", required = false, usage = "(optionnel) Champ libre d'usage")
    protected String tag = null;
    
    @Option(name = "--plaintext", required = false, usage = "(optionnel) Indique de passer les paramètres sous forme de chaînes plutôt que binaire")
    protected boolean isPlaintext = false;
    @Option(name = "--charset", required = false, usage = "(optionnel) Indique l\'encodage à utiliser")
    protected String charset = null;
    
    /* A faire */
    @Option(name = "--pluginParameter", required = false, usage = "(optionnel) Paramètres à passer en entréee au(x) plugin(s)")
    protected String pluginParameter = null;

    @Override
    public void parseAndRun(String[] arguments) throws CmdLineException, UnknownHostException, IOException {
        super.parseAndRun(arguments);

        CmdLineParser monParseur = new CmdLineParser(this);
        monParseur.parseArgument(arguments);
        if (requestId == null) {
            requestId = this.getClass().getPackage().getName() + "-" + System.currentTimeMillis();
        }

        if (tag == null) {
            tag = "Communication " + this.getClass().getPackage().getName() + " (" + System.getProperty("user.name") + "@" + InetAddress.getLocalHost().getHostName() + ")";
        }

        //mesParamsPlugins = new ArrayOfPluginParameterStruct();

        System.out.println("requestId     : " + requestId);
        System.out.println("transactionId : " + transactionId); //<== /* transaction a null = app mutu pour tous ?? */
        System.out.println("tag           : " + tag);
    }

    
}
