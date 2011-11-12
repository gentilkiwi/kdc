package org.kiwi.dictao.responses.dsam.verifySignature;

import org.kiwi.dictao.responses.*;
import org.kiwi.dictao.responses.Reponse.TypeReponse;

public class DSAMEnvelopeStatus extends ListeReponses<Integer> {

    public DSAMEnvelopeStatus(Integer leCode) {super(leCode);}

    @Override
    protected void computeListe(Integer leCode) {
        if ((leCode & 7) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur normalement non attribué"));
        }
        leCode >>= 3;

        if ((leCode & 1) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Au moins un des enregistrements des documents n'est pas conforme"));
        } else {
            maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Tous les enregistrements des documents sont conformes"));
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
        leCode >>= 1;

        if ((leCode & 1) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Au moins un des enregistrements des documents ne respecte pas les règles d'habilitation"));
        } else {
            maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Tous les enregistrements des documents respectent les règles d'habilitation"));
        }
        leCode >>= 1;

        if ((leCode & 1) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Au moins une des signatures d'un des documents est invalide"));
        } else {
            maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Toutes les signatures sont valides"));
        }
        leCode >>= 1;

        if ((leCode & 7) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur normalement non attribué"));
        }
        leCode >>= 3;

        if ((leCode & 1) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Archivage impossible"));
        } else {
            maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Archivage réussi"));
        }
        leCode >>= 1;

        if ((leCode & 1) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur de connexion avec la base de données"));
        } else {
            maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Pas d'erreur de connexion avec la base de données"));
        }
        leCode >>= 1;

        if ((leCode & 1) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Un des documents n'a pas été parsé par le parseur"));
        } else {
            maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Le ou les documents ont été parsés par le parseur"));
        }
        leCode >>= 1;

        if ((leCode & 1) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Le DVS n'a pas réussi à vérifier la signature d'un des documents"));
        } else {
            maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Le DVS a réussi à vérifier la signature de tous les documents"));
        }
        leCode >>= 1;

        if ((leCode & 1) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "L'enveloppe n'a pas pu être parsé par le pré-parseur"));
        } else {
            maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "L'enveloppe a été parsé avec succès par le pré-parseur"));
        }
    }
}
