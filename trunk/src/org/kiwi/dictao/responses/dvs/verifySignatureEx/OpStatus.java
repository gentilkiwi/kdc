package org.kiwi.dictao.responses.dvs.verifySignatureEx;

import org.kiwi.dictao.responses.*;
import org.kiwi.dictao.responses.Reponse.TypeReponse;

public class OpStatus extends ListeReponses<Integer>{

    public OpStatus(Integer leCode) {super(leCode);}
    
    @Override
    protected void computeListe(Integer leCode) {
                switch (leCode) {
            case 0:
                maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Traitement effectué avec succès"));
                break;
            case 11:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Structure de signature, de certificat ou de jeton d\'authentification invalide"));
                break;
            case 12:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Taille d\'un champ supérieure à la taille maximale autorisée ou champ vide (si obligatoire)"));
                break;
            case 13:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Taille de la requête supérieure à la taille maximale autorisée dans la politique de confiance"));
                break;
            case 14:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Format de la requête incorrect"));
                break;
            case 15:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Données manquantes dans la requête"));
                break;
            case 21:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Application non-autorisée"));
                break;
            case 22:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Transaction inconnue"));
                break;
            case 23:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Type de requête non autorisée"));
                break;
            case 26:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Application désactivée"));
                break;
            case 31:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Service DVSService injoignable"));
                break;
            case 32:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Problème d'accès à la base de données"));
                break;
            case 33:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Problème lors de l'appel au serveur d'horodatage"));
                break;
            case 41:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur du module de complètement AdES de la signature"));
                break;
            case 90:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur d\'exécution du Plugin Post-Action (Archivage externe...)"));
                break;
            case 99:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur interne DVS"));
                break;
            default:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur normalement non référencée"));
        }
    }
}
