package org.kiwi.dictao.responses.dtss.insertTimeStampEx;

import org.kiwi.dictao.responses.GeneralResultat;
import org.kiwi.dictao.webservices.dtss.*;

public class Resultat extends GeneralResultat<DTSSResponseEx> {

    public Resultat(DTSSResponseEx result) {super(result);}

    @Override
    public String toString() {
        StringBuilder monBuffer = new StringBuilder();
        monBuffer.append(super.toString());

        Integer monOpStatus = resultat.getOpStatus();
        Integer monDTSSGlobalStatus = resultat.getDTSSGlobalStatus();
        String monRequestId = resultat.getRequestId();
        String monArchiveId = resultat.getDTSSArchiveId();
        String maProof = resultat.getDTSSProof();
        DataType monExtendedSignature = resultat.getExtendedSignature();
        ArrayOfPluginResponseStruct monTabPluginResponses = resultat.getPluginResponse();

        monBuffer.append(new OpStatus(monOpStatus));
        monBuffer.append(new DTSSStatus(monDTSSGlobalStatus));
        monBuffer.append("RequestId : ").append(monRequestId).append("\n");
        monBuffer.append("ArchiveId : ").append(monArchiveId).append("\n");

        monBuffer.append("Preuve : ").append(maProof).append("\n");
        /* A faire ! */
        monBuffer.append("Signature étendue : ").append(monExtendedSignature).append("\n");

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
