package org.kiwi.dictao.responses.dvs.verifySignatureEx;

import org.kiwi.dictao.responses.GeneralResultat;
import org.kiwi.dictao.webservices.dvs.*;
import java.math.BigInteger;

public class Resultat extends GeneralResultat<DVSResponseEx> {

    public Resultat(DVSResponseEx result) {super(result);}

    @Override
    public String toString() {
        StringBuilder monBuffer = new StringBuilder();
        monBuffer.append(super.toString());

        Integer monOpStatus = resultat.getOpStatus();
        Integer monDVSGlobalStatus = resultat.getDVSGlobalStatus();
        String monRequestId = resultat.getRequestId();
        String monArchiveId = resultat.getDVSArchiveId();
        ArrayOfDVSDetailedStatusStruct monTabDetailledStatus = resultat.getDVSDetailedStatus();
        String maProof = resultat.getDVSProof();
        DataType monExtendedSignature = resultat.getExtendedSignature();
        ArrayOfPluginResponseStruct monTabPluginResponses = resultat.getPluginResponse();

        monBuffer.append(new OpStatus(monOpStatus));
        monBuffer.append(new DVSGlobalStatus(monDVSGlobalStatus));
        monBuffer.append("RequestId : ").append(monRequestId).append("\n");
        monBuffer.append("ArchiveId : ").append(monArchiveId).append("\n");
        
        if (monTabDetailledStatus != null) {
            StringBuilder monBufferSignatures = new StringBuilder();
            for (DVSDetailedStatusStruct monDVSDetailedStatus : monTabDetailledStatus.getDVSDetailedStatusStruct()) {
                monBufferSignatures.append("\nDonnée signée\n-------------\n");
                BigInteger monDVSCertificateStatus = monDVSDetailedStatus.getDVSStatus();

                monBufferSignatures.append("Type de signature : ").append(monDVSDetailedStatus.getType()).append("\n");
                monBufferSignatures.append("DN Signataire : ").append(monDVSDetailedStatus.getSubjectName()).append("\n");
                monBufferSignatures.append(new DVSStatus(monDVSCertificateStatus));
                monBufferSignatures.append("Certificat : ").append(monDVSDetailedStatus.getCertificate()).append("\n");
                monBufferSignatures.append("Données signées : ").append(monDVSDetailedStatus.getSignedData()).append("\n");
                monBufferSignatures.append("Statut étendue : ").append(monDVSDetailedStatus.getExtendedStatus()).append("\n");
            }
            monBuffer.append(monBufferSignatures.toString().replaceAll("(?m)(^)", "\t$1"));
        } else {
            monBuffer.append("Signature : ").append(monTabDetailledStatus).append("\n");
        }
        
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
        } else {
            monBuffer.append("Plugin : ").append(monTabPluginResponses);
        }

        return monBuffer.toString();
    }
}
