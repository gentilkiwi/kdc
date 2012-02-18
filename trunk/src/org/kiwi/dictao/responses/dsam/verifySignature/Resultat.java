package org.kiwi.dictao.responses.dsam.verifySignature;

import java.math.BigInteger;
import org.kiwi.dictao.responses.GeneralResultat;
import org.kiwi.dictao.webservices.dsam.*;

public class Resultat extends GeneralResultat<DSAMResponse> {

    public Resultat(DSAMResponse result) {
        super(result);
    }

    @Override
    public String toString() {
        StringBuilder monBuffer = new StringBuilder();
        monBuffer.append(super.toString());

        Integer monOpStatus = resultat.getOpStatus();
        Integer monDSAMEnvelopeStatus = resultat.getDSAMEnvelopeStatus();
        String monRequestId = resultat.getRequestId();
        long monProofId = resultat.getDSAMProofId();
        ArrayOfDocumentStruct mesDocuments = resultat.getDocumentList();

        monBuffer.append(new OpStatus(monOpStatus));
        monBuffer.append(new DSAMEnvelopeStatus(monDSAMEnvelopeStatus));
        monBuffer.append("RequestId : ").append(monRequestId).append("\n");
        monBuffer.append("ArchiveId : ").append(monProofId).append("\n");

        if (mesDocuments != null) {
            StringBuilder monBufferDocuments = new StringBuilder();
            for (DocumentStruct monDocument : mesDocuments.getDocumentStruct()) {

                Integer monAMDocumentStatus = monDocument.getAMDocumentStatus();
                String monDVSArchiveId = monDocument.getDVSArchiveId();
                Integer monDVSDocumentStatus = monDocument.getDVSDocumentStatus();
                String monDocumentId = monDocument.getDocumentId();
                ArrayOfSignatureStruct monTabSignature = monDocument.getSignatureList();
                ArrayOfRecordStruct monTabRecord = monDocument.getRecordList();
                ArrayOfPluginResponseStruct monTabPluginResponses = monDocument.getPluginResponse();

                monBufferDocuments.append("\nDocument\n--------\n");
                monBufferDocuments.append("DocumentId : ").append(monDocumentId).append("\n");

                monBufferDocuments.append("DVS ");
                if ((monDSAMEnvelopeStatus.intValue() & 16384) != 0) {   /* Signature :( */
                    monBufferDocuments.append(new org.kiwi.dictao.responses.dvs.verifySignatureEx.OpStatus(monDVSDocumentStatus));
                } else { /* Signature :) */
                    monBufferDocuments.append(new org.kiwi.dictao.responses.dvs.verifySignatureEx.DVSGlobalStatus(monDVSDocumentStatus));
                }
                monBufferDocuments.append("DVSArchiveId : ").append(monDVSArchiveId).append("\n");

                if (monTabSignature != null) {
                    StringBuilder monBufferSignatures = new StringBuilder();
                    for (SignatureStruct maSignature : monTabSignature.getSignatureStruct()) {
                        monBufferSignatures.append("\nDonnée signée\n-------------\n");

                        BigInteger monDVSCertificateStatus = maSignature.getDVSSignerStatus();

                        monBufferSignatures.append("Type de signature : ").append(maSignature.getType()).append("\n");
                        monBufferSignatures.append("DN Signataire : ").append(maSignature.getSubjectName()).append("\n");
                        monBufferSignatures.append(new org.kiwi.dictao.responses.dvs.verifySignatureEx.DVSStatus(monDVSCertificateStatus));
                        monBufferSignatures.append("Certificat : ").append(maSignature.getCertificate()).append("\n");
                        monBufferSignatures.append("Données signées : ").append(maSignature.getSignedData()).append("\n");
                    }
                    monBufferDocuments.append(monBufferSignatures.toString().replaceAll("(?m)(^)", "\t$1"));
                } else {
                    monBufferDocuments.append("Signature : ").append(monTabSignature).append("\n");
                }

                monBufferDocuments.append(new AMDocumentStatus(monAMDocumentStatus));
                if(monTabRecord != null) {
                    StringBuilder monBufferEnregistrements = new StringBuilder();
                    
                    for(RecordStruct monEnregistrement : monTabRecord.getRecordStruct()) {
                        monBufferEnregistrements.append("\nEnregistrement\n--------------\n");
                        monBufferEnregistrements.append("RecordId : ").append(monEnregistrement.getRecordId()).append("\n");
                        monBufferEnregistrements.append(new AMRecordStatus(monEnregistrement.getAMRecordStatus()));
                        
                        ArrayOfCriterionStruct monTabCriterionStruct = monEnregistrement.getCriteriaList();
                        
                        if(monTabCriterionStruct != null) {
                            StringBuilder monBufferCriteres = new StringBuilder();
                            
                            monBufferCriteres.append("\nCriteres\n========\n");
                            for (CriterionStruct monCrit : monTabCriterionStruct.getCriterionStruct()) {
                               
                                String monNom = monCrit.getCriterionName();
                                String monType = monCrit.getCriterionType();
                                CriterionType monCriterion = monCrit.getCriterionValue();

                                monBufferCriteres.append(monNom).append(" (").append(monType).append(") ");
                                switch (monType) {
                                    case "date":
                                        monBufferCriteres.append(monCriterion.getValueDate());
                                        break;
                                    case "string":
                                        monBufferCriteres.append(monCriterion.getValueString());
                                        break;
                                    case "double":
                                        monBufferCriteres.append(monCriterion.getValueDouble());
                                        break;
                                    case "float":
                                        monBufferCriteres.append(monCriterion.getValueFloat());
                                        break;
                                    case "int":
                                        monBufferCriteres.append(monCriterion.getValueInt());
                                        break;
                                    case "long":
                                        monBufferCriteres.append(monCriterion.getValueLong());
                                        break;
                                }
                                monBufferCriteres.append("\n");
                            }
                            
                            monBufferEnregistrements.append(monBufferCriteres.toString().replaceAll("(?m)(^)", "\t$1"));
                        } else {
                            monBufferEnregistrements.append("Critère : ").append(monTabCriterionStruct).append("\n");
                        }
                        
                    }
                    
                    monBufferDocuments.append(monBufferEnregistrements.toString().replaceAll("(?m)(^)", "\t$1"));
                } else {
                    monBufferDocuments.append("Enregistrement : ").append(monTabRecord).append("\n");
                }

                if (monTabPluginResponses != null) {
                    StringBuilder monBufferPluginResponse = new StringBuilder();
                    for (PluginResponseStruct maReponsePlugin : monTabPluginResponses.getPluginResponseStruct()) {
                        monBufferPluginResponse.append("\nPlugin\n------\n");
                        monBufferPluginResponse.append("Label : ").append(maReponsePlugin.getLabel()).append("\n");
                        monBufferPluginResponse.append("Réponse : ").append(maReponsePlugin.getResponse()).append("\n");
                    }
                    monBufferDocuments.append(monBufferPluginResponse.toString().replaceAll("(?m)(^)", "\t$1"));
                } else {
                    monBufferDocuments.append("Plugin : ").append(monTabPluginResponses);
                }

            }
            monBuffer.append(monBufferDocuments.toString().replaceAll("(?m)(^)", "\t$1"));
        } else {
            monBuffer.append("Document : ").append(mesDocuments).append("\n");
        }

        return monBuffer.toString();
    }
}
