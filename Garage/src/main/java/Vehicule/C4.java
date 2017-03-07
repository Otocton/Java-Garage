package Vehicule;

import Moteur.Moteur;

/**
 * Created by Morgan on 4/03/17.
 */
public class C4 extends Vehicule {
    public C4(Moteur moteur){
        super(moteur);
        this.prix = 10000.00;
        this.nom = "C4";
        this.nomMarque = Marque.CITROEN;
    }
}
