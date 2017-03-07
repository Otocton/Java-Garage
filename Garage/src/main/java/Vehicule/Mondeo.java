package Vehicule;

import Moteur.Moteur;

/**
 * Created by Morgan on 4/03/17.
 */
public class Mondeo extends Vehicule{
    public Mondeo(Moteur moteur){
        super(moteur);
        this.prix = 14000.00;
        this.nom = "Mondeo";
        this.nomMarque = Marque.FORD;
    }
}
