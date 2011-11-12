package org.kiwi.dictao.responses;

public class Reponse {

    public enum TypeReponse {
        ERREUR {
            @Override
           public String toString(){
                return "-";
            }
        },
        NEUTRE {
            @Override
            public String toString() {
                return " ";
            }
        },
        SUCCES {
            @Override
            public String toString() {
                return "+";
            }
        }
    };

    private TypeReponse typeDeLaReponse = null;
    private String laReponse = null;

    public Reponse(TypeReponse typeDeLaReponse, String laReponse) {
        this.typeDeLaReponse = typeDeLaReponse;
        this.laReponse = laReponse;
    }

    public TypeReponse getType(){
        return this.typeDeLaReponse;
    }

    public String getReponse(){
        return this.laReponse;
    }


}


