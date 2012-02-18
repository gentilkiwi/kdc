package org.kiwi.dictao.responses.dvs.ocsp;

import java.security.*;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import org.bouncycastle.ocsp.*;
import org.kiwi.dictao.responses.GeneralResultat;
import org.kiwi.utils.Hex;

public class Resultat extends GeneralResultat<OCSPResp> {

    protected PublicKey signKey;
    protected X509Certificate emmeteurSignature;

    public Resultat(OCSPResp result, PublicKey maCleDeSignature, X509Certificate monEmmeteurSignature) {
        super(result);
        signKey = maCleDeSignature;
        emmeteurSignature = monEmmeteurSignature;
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

                X509Certificate signOCSP = null;
                StringBuilder monBufferCertificates = new StringBuilder();
                try {
                    for (X509Certificate monCertificat : basicResponse.getCerts("BC")) {
                        if (signOCSP == null) {
                            signOCSP = monCertificat;
                        }
                        monBufferCertificates.append("\nCertificat\n==========\n");
                        monBufferCertificates.append("DN certificat      : ").append(monCertificat.getSubjectDN()).append('\n');
                        monBufferCertificates.append("Validité           : ").append(monCertificat.getNotBefore()).append(" -> ").append(monCertificat.getNotAfter()).append('\n');
                        monBufferCertificates.append("Numéro de série    : ").append(monCertificat.getSerialNumber()).append('\n');
                        monBufferCertificates.append("Emetteur           : ").append(monCertificat.getIssuerDN()).append('\n');

                    }
                } catch (NoSuchProviderException ex) {
                    monBufferCertificates.append("Erreur de provider ! : ").append(ex.getMessage()).append('\n');
                }
                monBuffer.append(monBufferCertificates.toString().replaceAll("(?m)(^)", "\t$1")).append('\n');

                if (signKey != null) {
                    monBuffer.append("Signature valide (vaFile)  : ");
                    try {
                        monBuffer.append((basicResponse.verify(signKey, "BC") ? "OK" : "KO"));
                    } catch (NoSuchProviderException ex) {
                        monBuffer.append("Erreur de provider ! : ").append(ex.getMessage());
                    }
                    monBuffer.append('\n');
                }

                if (signOCSP != null) {
                    if (emmeteurSignature != null) {
                        monBuffer.append("Signature (caFile, OCSP)   : ");
                        try {
                            signOCSP.verify(emmeteurSignature.getPublicKey(), "BC");
                            monBuffer.append("OK");
                        } catch (CertificateException ex) {
                            monBuffer.append("KO - Erreur de certificat : ").append(ex.getMessage());
                        } catch (NoSuchAlgorithmException ex) {
                            monBuffer.append("KO - Erreur d'algorithme : ").append(ex.getMessage());
                        } catch (InvalidKeyException ex) {
                            monBuffer.append("KO - Erreur de clé : ").append(ex.getMessage());
                        } catch (NoSuchProviderException ex) {
                            monBuffer.append("KO - Erreur de provider : ").append(ex.getMessage());
                        } catch (SignatureException ex) {
                            monBuffer.append("KO - Erreur de signature : ").append(ex.getMessage());
                        }
                        monBuffer.append('\n');
                    }

                    monBuffer.append("Signature valide (OCSP)    : ");
                    try {
                        monBuffer.append((basicResponse.verify(signOCSP.getPublicKey(), "BC") ? "OK" : "KO"));
                    } catch (NoSuchProviderException ex) {
                        monBuffer.append("Erreur de provider ! : ").append(ex.getMessage());
                    }
                    monBuffer.append('\n');
                }


                StringBuilder monBufferResponse = new StringBuilder();

                for (SingleResp maReponse : basicResponse.getResponses()) {
                    monBufferResponse.append("\nRéponse\n=======\n");
                    monBufferResponse.append("Certificat         : ").append(maReponse.getCertID().getSerialNumber()).append('\n');
                    monBufferResponse.append("Etat               : ");

                    Object status = maReponse.getCertStatus();
                    if (status == CertificateStatus.GOOD) {
                        monBufferResponse.append("OK");
                    } else if (status instanceof RevokedStatus) {
                        monBufferResponse.append("Révoqué");
                        RevokedStatus maRevok = (RevokedStatus) status;
                        monBufferResponse.append("\n\tDate de révocation : ").append(maRevok.getRevocationTime());
                        if (maRevok.hasRevocationReason()) {
                            monBufferResponse.append("\n\tRaison : ").append(maRevok.getRevocationReason());
                        }
                    } else if (status instanceof UnknownStatus) {
                        monBufferResponse.append("Inconnu");
                    } else {
                        monBufferResponse.append("Vraiment inconnu : ").append(status);
                    }
                    monBufferResponse.append('\n');

                    monBufferResponse.append("Algorithme de Hash : ").append(maReponse.getCertID().getHashAlgOID()).append(CertificateID.HASH_SHA1.contentEquals(maReponse.getCertID().getHashAlgOID()) ? " (SHA1)" : "").append('\n');
                    monBufferResponse.append("Nom émeteur (hash) : ").append(Hex.toHex(maReponse.getCertID().getIssuerNameHash())).append('\n');
                    monBufferResponse.append("Clé Emeteur (hash) : ").append(Hex.toHex(maReponse.getCertID().getIssuerKeyHash())).append('\n');
                    monBufferResponse.append("Mise à jour        : ").append(maReponse.getThisUpdate()).append(", prochaine : ").append(maReponse.getNextUpdate()).append('\n');
                }
                monBuffer.append(monBufferResponse.toString().replaceAll("(?m)(^)", "\t$1"));
            }
        } catch (OCSPException ex) {
            monBuffer.append("Erreur OCSP : ").append(ex.getMessage()).append('\n');
        }

        return monBuffer.toString();
    }
}
