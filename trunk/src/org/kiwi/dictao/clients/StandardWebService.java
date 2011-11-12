package org.kiwi.dictao.clients;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.kohsuke.args4j.*;

public class StandardWebService extends HttpsWebServiceClient {

    @Option(name = "--requestId", required = false, usage = "(optionnel) Identifiant de la requête")
    protected String requestId = null;
    @Option(name = "--transactionId", required = true, usage = "Identifiant de la transaction à utiliser")
    protected String transactionId = null;
    @Option(name = "--tag", required = false, usage = "(optionnel) Champ libre d'usage")
    protected String tag = null;

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
