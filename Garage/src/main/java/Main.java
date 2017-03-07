import Moteur.MoteurElectrique;
import Moteur.MoteurEssence;
import Moteur.MoteurHybride;
import Vehicule.*;
import Vehicule.Options.*;

/**
 * Created by Morgan on 4/03/17.
 */
 public class Main {
     public static void main(String[] args) {

         Garage garage = new Garage();
         Vehicule laguna = new Laguna(new MoteurEssence());
         Vehicule mondeo = new Mondeo(new MoteurHybride());
         Vehicule c4 = new C4(new MoteurElectrique());

         laguna.addOption(new GPS());
         laguna.addOption(new SiegeChauffant());
         laguna.addOption(new BarreDeToit());
         laguna.addOption(new VitreElectrique());
         laguna.addOption(new Climatisation());

         mondeo.addOption(new GPS());
         mondeo.addOption(new SiegeChauffant());
         mondeo.addOption(new BarreDeToit());
         mondeo.addOption(new VitreElectrique());
         mondeo.addOption(new Climatisation());

         c4.addOption(new GPS());
         c4.addOption(new SiegeChauffant());
         c4.addOption(new BarreDeToit());
         c4.addOption(new VitreElectrique());
         c4.addOption(new Climatisation());

         garage.addVehicule(laguna);
         garage.addVehicule(mondeo);
         garage.addVehicule(c4);

         System.out.println(garage);
         System.out.println();
         garage.getVehicules();

         System.out.println();

         System.out.println("Options de la "+ laguna.getMarque() + " " + laguna.getNom() + " :");
         System.out.println(laguna.getOptions());

    }
}
