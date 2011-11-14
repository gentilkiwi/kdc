package org.kiwi.dictao.responses.dtss.ts;

import org.kiwi.dictao.responses.*;
import org.kiwi.dictao.responses.Reponse.TypeReponse;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

public class TSFailureInfo extends ListeReponses<PKIFailureInfo> {

    public TSFailureInfo(PKIFailureInfo lInfo) {
        super(lInfo);
    }

    @Override
    protected void computeListe(PKIFailureInfo leCode) {
        switch (leCode.intValue()) {
            case 0:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Algorithme non supporté ou non reconnu"));
                break;
            case 2:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Transaction non supportée ou non permise"));
                break;
            case 5:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "La donnée soumise est au mauvais format"));
                break;
            case 14:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "La source de temps n'est pas disponible"));
                break;
            case 15:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "La politique d'horodatage n'est pas supportée"));
                break;
            case 16:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "L'extension demandée n'est pas supportée"));
                break;
            case 17:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Les informations aditionnelles demandées ne sont pas disponibles ou comprises"));
                break;
            case 25:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur système"));
                break;
            default:
                maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur normalement non référencée !"));
        }
        String laChaine = leCode.getString();
        if(laChaine != null) {
            maListeDeReponses.add(new Reponse(TypeReponse.NEUTRE, "Information : " + laChaine));
        }
    }
}
