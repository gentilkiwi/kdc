package org.kiwi.dictao.responses;

public class GeneralResultat<TYPE> {
    protected TYPE resultat;

    protected GeneralResultat(TYPE result)
    {
        resultat = result;
    }

    @Override
    public String toString() {
        String banierre = "Réponse " + this.getClass().getPackage().getName();
        return (banierre + '\n' + new String(new char[banierre.length()]).replace('\0', '=') + "\n");
    }
}
