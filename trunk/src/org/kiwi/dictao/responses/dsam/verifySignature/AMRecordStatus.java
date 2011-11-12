package org.kiwi.dictao.responses.dsam.verifySignature;

import org.kiwi.dictao.responses.*;
import org.kiwi.dictao.responses.Reponse.TypeReponse;

public class AMRecordStatus extends ListeReponses<Integer>{

    public AMRecordStatus(Integer leCode) {super(leCode);}
    
    @Override
    protected void computeListe(Integer leCode) {
                switch (leCode) {
            case 0:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "L'enregistrement ne respecte pas les règles d'habilitation"));
                break;
            case -1:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur lors de la vérification des habilitations"));
                break;
            default:
                maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "La règle d'habilitation respecté est la " + leCode));
        }
    }
}
