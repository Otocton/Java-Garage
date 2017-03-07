package Vehicule;

import Moteur.Moteur;

/**
 * Created by Morgan on 4/03/17.
 */
public class Laguna extends Vehicule {

    //public Laguna(){}

    public Laguna(Moteur moteur){
        super(moteur);
        this.prix = 12000.00;
        this.nom = "Laguna";
        this.nomMarque = Marque.RENAULT;
    }
}
