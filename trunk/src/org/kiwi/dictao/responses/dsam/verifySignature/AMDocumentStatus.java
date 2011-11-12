package org.kiwi.dictao.responses.dsam.verifySignature;

import org.kiwi.dictao.responses.*;
import org.kiwi.dictao.responses.Reponse.TypeReponse;

public class AMDocumentStatus extends ListeReponses<Integer> {

    public AMDocumentStatus(Integer leCode) {super(leCode);}

    @Override
    protected void computeListe(Integer leCode) {
        if ((leCode & 127) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur normalement non attribué"));
        }
        leCode >>= 7;

        if ((leCode & 1) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Au moins un des enregistrements du document ne respecte pas les règles d'habilitation"));
        } else {
            maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Tous les enregistrements du document respectent les règles d'habilitation"));
        }
        leCode >>= 1;

        if ((leCode & 7) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur normalement non attribué"));
        }
        leCode >>= 3;
        
        if ((leCode & 1) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Au moins un des enregistrements du document n'est pas conforme"));
        } else {
            maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Tous les enregistrements du document sont conformes"));
        }
        leCode >>= 1;

        if ((leCode & 1) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Le document n'a pas été parsé par le parseur"));
        } else {
            maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Le document à été parsé par le parseur"));
        }
        leCode >>= 1;

        if ((leCode & 1) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur de connexion avec la base de données"));
        } else {
            maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Pas d'erreur de connexion avec la base de données"));
        }
        leCode >>= 1;

        if ((leCode & 1) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "La gamme de vérification de gamme utilisé par le DVS est incorrecte (manque du certificat ou des données signées)"));
        } else {
            maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "La gamme de vérification de gamme utilisé par le DVS est correcte"));
        }
        leCode >>= 1;

        if ((leCode & 1) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Au moins une des signatures ne porte pas sur l'ensemble des données (i.e toutes les données ne son pas signées)"));
        } else {
            maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Les signatures des documents portent sur l'ensemble des données"));
        }
    }
}
