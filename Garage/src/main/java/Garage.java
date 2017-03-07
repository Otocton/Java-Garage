import Vehicule.Vehicule;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Morgan on 4/03/17.
 */
public class Garage {
    List<Vehicule> garage = new LinkedList();

    // Custom
    public void addVehicule(Vehicule vehicule){
        this.garage.add(vehicule);
    }

    // Getters
    public void getVehicules(){
        for(Vehicule v : this.garage) {
            System.out.println(v);
        }
    }

    public int getNbVehicules(){
        return this.garage.size();
    }

    // Default
    public String toString(){
        return "Garage contenant : "+ this.getNbVehicules() +" véhicule(s)";
    };

}
