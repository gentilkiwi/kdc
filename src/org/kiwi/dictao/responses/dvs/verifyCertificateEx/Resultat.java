package org.kiwi.dictao.responses.dvs.verifyCertificateEx;

import java.io.IOException;
import org.kiwi.dictao.responses.GeneralResultat;
import org.kiwi.dictao.webservices.dvs.*;
import java.math.BigInteger;
import org.kiwi.utils.Base64;

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
        ArrayOfPluginResponseStruct monTabPluginResponses = resultat.getPluginResponse();

        monBuffer.append(new OpStatus(monOpStatus));
        monBuffer.append(new DVSGlobalStatus(monDVSGlobalStatus));
        monBuffer.append("RequestId : ").append(monRequestId).append("\n");
        monBuffer.append("ArchiveId : ").append(monArchiveId).append("\n");
        
        if (monTabDetailledStatus != null) {
            StringBuilder monBufferCertificates = new StringBuilder();
            for (DVSDetailedStatusStruct monDVSDetailedStatus : monTabDetailledStatus.getDVSDetailedStatusStruct()) {
                monBufferCertificates.append("\nDonnée signée\n-------------\n");
                BigInteger monDVSCertificateStatus = monDVSDetailedStatus.getDVSStatus();
                monBufferCertificates.append("Type de signature : ").append(monDVSDetailedStatus.getType()).append("\n");
                monBufferCertificates.append("DN Signataire : ").append(monDVSDetailedStatus.getSubjectName()).append("\n");
                monBufferCertificates.append(new DVSStatus(monDVSCertificateStatus));
                monBufferCertificates.append("Certificat : ").append(monDVSDetailedStatus.getCertificate()).append("\n");
                monBufferCertificates.append("Données signées : ").append(monDVSDetailedStatus.getSignedData()).append("\n");
                monBufferCertificates.append("Statut étendue : ").append(monDVSDetailedStatus.getExtendedStatus()).append("\n");
            }
            monBuffer.append(monBufferCertificates.toString().replaceAll("(?m)(^)", "\t$1"));
        }
        else {
            monBuffer.append("Signature : ").append(monTabDetailledStatus).append("\n");
        }
        
        monBuffer.append("Preuve : ").append(maProof).append("\n");

        if (monTabPluginResponses != null) {
            StringBuilder monBufferPluginResponse= new StringBuilder();
            for (PluginResponseStruct maReponsePlugin : monTabPluginResponses.getPluginResponseStruct()) {
                monBufferPluginResponse.append("\nPlugin\n------\n");
                monBufferPluginResponse.append("Label : ").append(maReponsePlugin.getLabel()).append("\n");
                monBufferPluginResponse.append("Réponse : ");
                try {
                    monBufferPluginResponse.append(new String(Base64.decode(maReponsePlugin.getResponse())));
                } catch (IOException ex) {
                    monBufferPluginResponse.append("ERREUR de décodage Base64 : ").append(ex.toString()).append("\n");
                    monBufferPluginResponse.append("Base64 : ").append(maReponsePlugin.getResponse());
                }
                monBufferPluginResponse.append("\n");
            }
            monBuffer.append(monBufferPluginResponse.toString().replaceAll("(?m)(^)", "\t$1"));
        }
        else {
            monBuffer.append("Plugin : ").append(monTabPluginResponses);
        }

        return monBuffer.toString();
    }
}
