package org.kiwi.dictao.responses.d2s.signatureEx;

import org.kiwi.dictao.responses.GeneralResultat;
import org.kiwi.dictao.webservices.d2s.*;

public class Resultat extends GeneralResultat<D2SResponseEx>{

    public Resultat(D2SResponseEx result) {super(result);}

    @Override
    public String toString() {
        StringBuilder monBuffer = new StringBuilder();
        monBuffer.append(super.toString());

        Integer monOpStatus = resultat.getOpStatus();
        Integer monD2SStatus = resultat.getD2SStatus();
        String monRequestId = resultat.getRequestId();
        String monArchiveId = resultat.getD2SArchiveId();
        /**/
        DataType maSignature = resultat.getD2SSignature();
        ArrayOfPluginResponseStruct monTabPluginResponses = resultat.getPluginResponse();
        
        monBuffer.append(new OpStatus(monOpStatus));
        monBuffer.append(new D2SStatus(monD2SStatus));
        monBuffer.append("RequestId : ").append(monRequestId).append("\n");
        monBuffer.append("ArchiveId : ").append(monArchiveId).append("\n");
        
        if (monTabPluginResponses != null) {
            StringBuilder monBufferPluginResponse= new StringBuilder();
            for (PluginResponseStruct maReponsePlugin : monTabPluginResponses.getPluginResponseStruct()) {
                monBufferPluginResponse.append("\nPlugin\n------\n");
                monBufferPluginResponse.append("Label : ").append(maReponsePlugin.getLabel()).append("\n");
                monBufferPluginResponse.append("Réponse : ").append(maReponsePlugin.getResponse()).append("\n");
            }
            monBuffer.append(monBufferPluginResponse.toString().replaceAll("(?m)(^)", "\t$1"));
        }
        else {
            monBuffer.append("Plugin : ").append(monTabPluginResponses);
        }

        return monBuffer.toString();
    }
}
