package Moteur;

import javafx.scene.shape.Cylinder;

/**
 * Created by Morgan on 4/03/17.
 */
public class MoteurDiesel extends Moteur{
    public MoteurDiesel(){
        this.type = TypeMoteur.DIESEL;
        this.cylindre = "2.0";
        this.prix = 5000.00;
    }
}
