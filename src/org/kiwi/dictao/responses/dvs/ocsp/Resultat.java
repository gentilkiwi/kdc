package org.kiwi.dictao.responses.dvs.ocsp;

import java.security.NoSuchProviderException;
import java.security.PublicKey;
import org.bouncycastle.ocsp.*;
import org.kiwi.dictao.responses.GeneralResultat;

import org.kiwi.utils.Hex;

public class Resultat extends GeneralResultat<OCSPResp> {

    protected PublicKey signKey;

    public Resultat(OCSPResp result, PublicKey maCleDeSignature) {
        super(result);
        signKey = maCleDeSignature;
    }

    @Override
    public String toString() {
        StringBuilder monBuffer = new StringBuilder();
        monBuffer.append(super.toString());

        Integer monStatus = resultat.getStatus();
        monBuffer.append(new Status(monStatus));

        try {
            BasicOCSPResp basicResponse = (BasicOCSPResp) resultat.getResponseObject();

            if (basicResponse != null) {
                monBuffer.append("Version OCSP               : ").append(basicResponse.getVersion()).append('\n');
                monBuffer.append("Date de la réponse         : ").append(basicResponse.getProducedAt()).append('\n');
                monBuffer.append("Algorithme de signature    : ").append(basicResponse.getSignatureAlgName()).append(" (").append(basicResponse.getSignatureAlgOID()).append(")").append('\n');

                if (signKey != null) {
                    monBuffer.append("Signature valide           : ");
                    try {
                        monBuffer.append((basicResponse.verify(signKey, "BC") ? "OK" : "KO"));
                    } catch (NoSuchProviderException ex) {
                        monBuffer.append("Erreur de provider ! : ").append(ex.getMessage());
                    }
                    monBuffer.append('\n');
                }
                StringBuilder monBufferCertificates = new StringBuilder();

                for (SingleResp maReponse : basicResponse.getResponses()) {
                    monBufferCertificates.append('\n');
                    monBufferCertificates.append("Certificat         : ").append(maReponse.getCertID().getSerialNumber()).append('\n');
                    monBufferCertificates.append("Etat               : ");

                    Object status = maReponse.getCertStatus();
                    if (status == CertificateStatus.GOOD) {
                        monBufferCertificates.append("OK");
                    } else if (status instanceof RevokedStatus) {
                        monBufferCertificates.append("Révoqué");
                    } else if (status instanceof UnknownStatus) {
                        monBufferCertificates.append("Inconnu");
                    } else {
                        monBufferCertificates.append("Vraiment inconnu : ").append(status);
                    }
                    monBufferCertificates.append('\n');

                    monBufferCertificates.append("Algorithme de Hash : ").append(maReponse.getCertID().getHashAlgOID()).append(CertificateID.HASH_SHA1.contentEquals(maReponse.getCertID().getHashAlgOID()) ? " (SHA1)" : "").append('\n');
                    monBufferCertificates.append("Nom émeteur        : ").append(Hex.toHex(maReponse.getCertID().getIssuerNameHash())).append('\n');
                    monBufferCertificates.append("Clé Emeteur        : ").append(Hex.toHex(maReponse.getCertID().getIssuerKeyHash())).append('\n');
                    monBufferCertificates.append("Mise à jour        : ").append(maReponse.getThisUpdate()).append(", prochaine : ").append(maReponse.getNextUpdate()).append('\n');
                }
                monBuffer.append(monBufferCertificates.toString().replaceAll("(?m)(^)", "\t$1"));
            }
        } catch (OCSPException ex) {
            monBuffer.append("Erreur OCSP : ").append(ex.getMessage()).append('\n');
        }

        return monBuffer.toString();
    }
}
