package Moteur;

/**
 * Created by Morgan on 4/03/17.
 */
public abstract class Moteur implements iMoteur {
    protected TypeMoteur type;
    protected String cylindre;
    protected Double prix;

    // Getters
    public Double getPrix(){
        return this.prix;
    }

    public String getType(){
        return this.type.getType();
    }

    public String getCylindre(){
        return this.cylindre;
    }

    // Default
    public String toString(){
        return "Moteur "+ this.getType() +" de "+ this.getCylindre() +"L et je coûte " + this.getPrix();
    }
}