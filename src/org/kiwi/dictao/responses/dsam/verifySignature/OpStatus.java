package org.kiwi.dictao.responses.dsam.verifySignature;

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
            case 10:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur lors du chargement de la table de correspondance"));
                break;
            case 11:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Paramètre manquant dans la table de correspondance"));
                break;
            case 12:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Paramètre d'entrée manquant"));
                break;
            case 13:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Paramètre d'entrée invalide"));
                break;
            case 20:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur avec la base de données"));
                break;
            case 21:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur d'insertion de la preuve dans la base de données"));
                break;
            case 30:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur lors de l'appel au préparseur"));
                break;
            case 99:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur interne DSAM"));
                break;
            default:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur normalement non référencée"));
        }
    }
}
