package org.kiwi.dictao.responses.dvs.verifySignatureEx;

import java.math.BigInteger;
import org.kiwi.dictao.responses.*;
import org.kiwi.dictao.responses.Reponse.TypeReponse;

public class DVSStatus extends ListeReponses<BigInteger>{

    public DVSStatus(BigInteger leCode) {super(leCode);}

    @Override
    protected void computeListe(BigInteger leCode) {
        int iDVSDetailedStatus = leCode.intValue();

        if ((iDVSDetailedStatus & 127) != 0) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur normalement non attribué"));
        }
        iDVSDetailedStatus >>= 7;

        if ((iDVSDetailedStatus & 1) != 0) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Incohérence entre les références (AdES-C) et les valeurs (AdES-L) des données de validation d\'une signature AdES-A (les références ne correspondent pas aux valeurs)"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Cohérence entre les références (AdES-C) et les valeurs (AdES-L) des données de validation d\'une signature AdES-A"));
        }
        iDVSDetailedStatus >>= 1;
        

        if ((iDVSDetailedStatus & 1) != 0) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Référence introuvable lors de la résolution des références"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Succès de la résolution des références"));
        }
        iDVSDetailedStatus >>= 1;

        if ((iDVSDetailedStatus & 1) != 0) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Jeton d\'horodatage de la signature invalide"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Jeton d\'horodatage de la signature valide"));
        }
        iDVSDetailedStatus >>= 1;

        if ((iDVSDetailedStatus & 1) != 0) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "En dehors de la fenêtre temporelle (non implémenté)"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Fenêtre temporelle respectée (non implémenté)"));
        }
        iDVSDetailedStatus >>= 1;


        if ((iDVSDetailedStatus & 1) != 0) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Signature cryptographique invalide"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Signature cryptographique valide"));
        }
        iDVSDetailedStatus >>= 1;

        if ((iDVSDetailedStatus & 3) == 3) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur normalement non attribué"));
        } else if ((iDVSDetailedStatus & 3) == 2) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Vérification de la stabilité sémantique du document impossible"));
        } else if ((iDVSDetailedStatus & 3) == 1) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Stabilité sémantique du document : instable"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Stabilité sémantique du document : stable (ou non demandé)"));
        }
        iDVSDetailedStatus >>= 2;

        if ((iDVSDetailedStatus & 1) != 0) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Propriétés de la signatures non-conformes"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Propriétés de la signatures conformes (ou non spécifiées)"));
        }
        iDVSDetailedStatus >>= 1;

        if ((iDVSDetailedStatus & 1) != 0) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Horodatage de réception de la signature impossible"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Horodatage de réception de la signature effectué (ou non demandé)"));
        }
        iDVSDetailedStatus >>= 1;

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
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Le DN du certificat n'est pas trouvé dans la liste blanche/noire"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Le DN du certificat est trouvé dans la liste blanche/noire (ou aucune liste de DN n'est configurée)"));
        }
        iDVSDetailedStatus >>= 1;

        if ((iDVSDetailedStatus & 1) != 0) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Le certificat n'est pas trouvé dans la liste blanche/noire"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Le certificat est trouvé dans la liste blanche/noire de certificats (ou aucune liste n'est configurée)"));
        }
        iDVSDetailedStatus >>= 1;

        if ((iDVSDetailedStatus & 1) != 0) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Certificat de signature en dehors de sa période de validité"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Certificat de signature en cours de validité"));
        }
        iDVSDetailedStatus >>= 1;

        if ((iDVSDetailedStatus & 1) != 0) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Au moins un des contrôles effectué n'a pas retourné le résultat attendu"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Tous les contrôles effectués sur la signature et le certificat du signataire ont retourné le résultat attendu"));
        }
    }
}
