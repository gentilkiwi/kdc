package org.kiwi.dictao.responses.dtss.ts;

import java.security.NoSuchProviderException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.tsp.Accuracy;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.tsp.GenTimeAccuracy;
import org.bouncycastle.tsp.TSPException;
import org.bouncycastle.tsp.TSPValidationException;
import org.bouncycastle.tsp.TimeStampRequest;
import org.bouncycastle.tsp.TimeStampResponse;
import org.bouncycastle.tsp.TimeStampToken;
import org.bouncycastle.tsp.TimeStampTokenInfo;
import org.kiwi.dictao.responses.GeneralResultat;

public class Resultat extends GeneralResultat<TimeStampResponse> {

    protected X509Certificate signCertificate;
    protected TimeStampRequest requete;

    public Resultat(TimeStampResponse result, TimeStampRequest maRequete, X509Certificate monCertifDeSignature) {
        super(result);
        requete = maRequete;
        signCertificate = monCertifDeSignature;
    }

    @Override
    public String toString() {
        StringBuilder monBuffer = new StringBuilder();
        monBuffer.append(super.toString());
        
        
        monBuffer.append("Validation de la réponse : ");
        try {
            resultat.validate(requete);
            monBuffer.append("OK");
        } catch (TSPException ex) {
            monBuffer.append("KO - ").append(ex.getMessage());
        }
        monBuffer.append("\n");
        
        
        Integer monStatus = resultat.getStatus();
        String statusString = resultat.getStatusString();
        PKIFailureInfo monFailInfo = resultat.getFailInfo();
        
        TimeStampToken monToken = resultat.getTimeStampToken();
        
        monBuffer.append(new Status(monStatus));
        monBuffer.append("StatusString : ").append(statusString).append("\n");
        if(monFailInfo != null) {
            monBuffer.append(new TSFailureInfo(monFailInfo));
        }
                
        if (monToken != null) {
            StringBuilder monBufferToken = new StringBuilder();
            monBufferToken.append("\nToken\n=====\n");
        
            
            monBuffer.append("Validation du token : ");
            if(signCertificate != null) {
                try {
                    monToken.validate(signCertificate, "BC");
                    monBuffer.append("OK");
                } catch (CertificateExpiredException ex) {
                    monBuffer.append("KO - Certificate expiré ; ").append(ex.getMessage());
                } catch (CertificateNotYetValidException ex) {
                    monBuffer.append("KO - Certificate pas encore valide ; ").append(ex.getMessage());
                } catch (NoSuchProviderException ex) {
                    monBuffer.append("KO - Provider non valide ; ").append(ex.getMessage());
                } catch (TSPValidationException ex) {
                    monBuffer.append("KO - Erreur de validation TS ; ").append(ex.getMessage());
                } catch (TSPException ex) {
                    monBuffer.append("KO - Erreur TS ; ").append(ex.getMessage());
                }
                monBuffer.append("\n");
            }
            
            StringBuilder monBufferCertificats = new StringBuilder();
            for (Object maReponse : monToken.getCertificates().getMatches(null)) {
                X509CertificateHolder monCertificate = (X509CertificateHolder) maReponse;
                monBufferCertificats.append("Certificat : ").append(monCertificate.getSubject()).append("\n");
            }
            monBufferToken.append(monBufferCertificats.toString()/*.replaceAll("(?m)(^)", "\t$1")*/);

            StringBuilder monBufferCRL = new StringBuilder();
            for (Object maReponse : monToken.getCRLs().getMatches(null)) {
                X509CRLHolder maCRL = (X509CRLHolder) maReponse;
                monBufferCRL.append("CRL émise par : ").append(maCRL.getIssuer()).append("\n");
            }
            monBufferToken.append(monBufferCRL.toString()/*.replaceAll("(?m)(^)", "\t$1")*/);

            /*
            StringBuilder monBufferAttributes = new StringBuilder();
            monBufferToken.append(monBufferAttributes.toString().replaceAll("(?m)(^)", "\t$1"));
             */
            monToken.getSID().getCertificate();
            TimeStampTokenInfo mesInfos = monToken.getTimeStampInfo();
            if (mesInfos != null) {
                StringBuilder monBufferInfos = new StringBuilder();
                monBufferInfos.append("\nInformations\n============\n");
                
                monBufferInfos.append("Généré à                   : ").append(mesInfos.getGenTime()).append("\n");
                GenTimeAccuracy genAcc = mesInfos.getGenTimeAccuracy();
                monBufferInfos.append(" * Précision               : ");
                if(genAcc != null) {
                    monBufferInfos.append(genAcc.getSeconds()).append("s").append(genAcc.getMillis()).append("ms").append(genAcc.getMicros()).append("µs").append("\n");
                } else {
                    monBufferInfos.append("Aucune\n");
                }
                
                monBufferInfos.append("Algorithme de hash         : ").append(mesInfos.getMessageImprintAlgOID()).append("\n");
                monBufferInfos.append("OID Politique de Signature : ").append(mesInfos.getPolicy()).append("\n");
                monBufferInfos.append("Numéro de série            : ").append(mesInfos.getSerialNumber()).append("\n");
                monBufferInfos.append("Autorité de TimeStamp      : ").append(mesInfos.getTsa()).append("\n");

                Accuracy acc = mesInfos.getAccuracy();
                monBufferInfos.append(" * Précision               : ");
                if(acc != null) {
                    monBufferInfos.append(acc.getSeconds()).append("s").append(acc.getMillis()).append("ms").append(acc.getMicros()).append("µs").append("\n");
                } else {
                    monBufferInfos.append("Aucune\n");
                }
                
                monBufferToken.append(monBufferInfos.toString().replaceAll("(?m)(^)", "\t$1"));
                
            } else {
                monBufferToken.append("Pas d\'informations\n");
            }
            
            
            monBuffer.append(monBufferToken.toString().replaceAll("(?m)(^)", "\t$1"));
            
            
        } else {
            monBuffer.append("Pas de token\n");
        }
        return monBuffer.toString();
    }
}
