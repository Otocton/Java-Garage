package Vehicule;

/**
 * Created by Morgan on 4/03/17.
 */
public enum Marque {
    RENAULT("Renault"),
    FORD("Ford"),
    CITROEN("Citroen");

    protected final String nom;

    Marque(String nom){
        this.nom = nom;
    }

    protected String getMarque(){
        return this.nom;
    }
}