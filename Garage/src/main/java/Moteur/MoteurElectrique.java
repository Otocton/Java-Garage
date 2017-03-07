package Moteur;

/**
 * Created by Morgan on 4/03/17.
 */
public class MoteurElectrique extends Moteur {
    public MoteurElectrique(){
        this.type = TypeMoteur.ELECTRIQUE;
        this.cylindre = "Electrique";
        this.prix = 8000.00;
    }
}
