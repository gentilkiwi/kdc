package org.kiwi.dictao.responses.d2s.signatureEx;

import org.kiwi.dictao.responses.*;
import org.kiwi.dictao.responses.Reponse.TypeReponse;

public class D2SStatus extends ListeReponses<Integer> {

    public D2SStatus(Integer leCode) {super(leCode);}

    @Override
    protected void computeListe(Integer leCode) {
        if ((leCode & 2047) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur normalement non attribué"));
        }
        leCode >>= 11;

        if ((leCode & 3) == 3) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur normalement non attribué"));
        } else if ((leCode & 3) == 2) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Stabilité sémantique du document : instable"));
        } else if ((leCode & 3) == 1) {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Stabilité sémantique du document : stable"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.NEUTRE, "Vérification de la stabilité sémantique du document non demandée"));
        }
        leCode >>= 2;

        if ((leCode & 1) != 0) {
           maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Horodatage de réception de la signature impossible"));
        } else {
           maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Horodatage de réception de la signature effectué (ou non demandé)"));
        }
        leCode >>= 1;

        if ((leCode & 1) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Certificat entité invalide"));
        } else {
            maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Certificat entité valide"));
        }
        leCode >>= 1;

        if ((leCode & 1) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur normalement non attribué"));
        }
    }
}
