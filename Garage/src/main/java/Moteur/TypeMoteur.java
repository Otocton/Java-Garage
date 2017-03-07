package Moteur;

/**
 * Created by Morgan on 4/03/17.
 */
public enum TypeMoteur {
    DIESEL("Diesel"),
    ESSENCE("Essence"),
    HYBRIDE("Hybride"),
    ELECTRIQUE("Electrique");

    private final String type;

    TypeMoteur(String type){
        this.type = type;
    }

    protected String getType(){
        return this.type;
    }
}
