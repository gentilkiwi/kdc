package org.kiwi.dictao.responses.dtss.ts;

import org.kiwi.dictao.responses.*;
import org.kiwi.dictao.responses.Reponse.TypeReponse;

public class Status extends ListeReponses<Integer>{

    public Status(Integer leCode) {super(leCode);}
    
    @Override
    protected void computeListe(Integer leCode) {
                switch (leCode) {
            case 0:
                maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Succès"));
                break;
            case 1:
                maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Succès, avec modifications"));
                break;
            case 2:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Rejeté"));
                break;
            case 3:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "En attente"));
                break;
            case 4:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Révocation imminente"));
                break;
            case 5:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Révoqué"));
                break;
            default:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur normalement non référencée (hors protocole)"));
        }
    }
}
