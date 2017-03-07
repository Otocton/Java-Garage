package Vehicule.Options;

/**
 * Created by Morgan on 5/03/17.
 */
public abstract class Option implements iOption {
    protected String nom;
    protected Double prix;

    public Option(){}

    // Getters
    public String getNom() { return this.nom; }
    public Double getPrix(){
        return this.prix;
    }

    // Default
    public String toString(){
        return ""+ this.getNom()+ " : " + this.getPrix();
    }
}
