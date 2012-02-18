package org.kiwi.dictao.responses.dvs.verifyCertificateEx;

import java.math.BigInteger;
import org.kiwi.dictao.responses.ListeReponses;
import org.kiwi.dictao.responses.Reponse;
import org.kiwi.dictao.responses.Reponse.TypeReponse;

public class DVSStatus extends ListeReponses<BigInteger>{

    public DVSStatus(BigInteger leCode) {super(leCode);}

    @Override
    protected void computeListe(BigInteger leCode) {
        int iDVSDetailedStatus = leCode.intValue();

        if ((iDVSDetailedStatus & 65535) != 0) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur normalement non attribué"));
        }
        iDVSDetailedStatus >>= 16;

        if ((iDVSDetailedStatus & 3) == 3) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "AC émettrice non référencée"));
        } else if ((iDVSDetailedStatus & 3) == 2) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Données de validation manquantes"));
        } else if ((iDVSDetailedStatus & 3) == 1) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Certificat révoqué"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Certificat valide"));
        }
        iDVSDetailedStatus >>= 2;

         if ((iDVSDetailedStatus & 3) == 3) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur normalement non attribué"));
        } else if ((iDVSDetailedStatus & 3) == 2) {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "OCSP dès que disponible"));
        } else if ((iDVSDetailedStatus & 3) == 1) {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "OCSP pour le certificat de sinature"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "CRL et ARL pour toute la chaîne"));
        }
        iDVSDetailedStatus >>= 2;

        if ((iDVSDetailedStatus & 3) == 3) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "AC en dehors de sa période de validité"));
        } else if ((iDVSDetailedStatus & 3) == 2) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Données de validation manquantes"));
        } else if ((iDVSDetailedStatus & 3) == 1) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Au moins une AC révoquée"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "La chaîne est valide"));
        }
        iDVSDetailedStatus >>= 2;

        if ((iDVSDetailedStatus & 1) != 0) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur normalement non attribué"));
        }
        iDVSDetailedStatus >>= 1;

        if ((iDVSDetailedStatus & 1) != 0) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Algorithme interdit"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Algorithme conforme"));
        }
        iDVSDetailedStatus >>= 1;

        if ((iDVSDetailedStatus & 1) != 0) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Validation métier d\'une CRL non valide"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Validation métier d\'une CRL valide (ou non paramétrée)"));
        }
        iDVSDetailedStatus >>= 1;

        if ((iDVSDetailedStatus & 1) != 0) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Extensions QCStatements non conformes"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Extensions QCStatements conformes (ou non spécifiées)"));
        }
        iDVSDetailedStatus >>= 1;

        if ((iDVSDetailedStatus & 1) != 0) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "OID de la Politique de Certification non référencée"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "OID de la Politique de Certification référencée (ou non spécifiées)"));
        }
        iDVSDetailedStatus >>= 1;

        if ((iDVSDetailedStatus & 1) != 0) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Usage de la clé non conforme"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Usage de la clé conforme (ou non spécifiées)"));
        }
        iDVSDetailedStatus >>= 1;

        if ((iDVSDetailedStatus & 1) != 0) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Le DN du certificat n'est pas trouvé dans la liste blanche"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Le DN du certificat est trouvé dans la liste blanche (ou aucune liste de DN n'est configurée)"));
        }
        iDVSDetailedStatus >>= 1;

        if ((iDVSDetailedStatus & 1) != 0) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Le certificat n'est pas trouvé dans la liste blanche"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Le certificat est trouvé dans la liste blanche de certificats (ou aucune liste n'est configurée)"));
        }
        iDVSDetailedStatus >>= 1;

        if ((iDVSDetailedStatus & 1) != 0) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Certificat de signature en dehors de sa période de validité"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Certificat de signature en cours de validité"));
        }
        iDVSDetailedStatus >>= 1;

        if ((iDVSDetailedStatus & 1) != 0) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Le certificat est invalide"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Le certificat est valide (tous les contrôles effectués ont retournés le résultat attendu)"));
        }
    }
}
