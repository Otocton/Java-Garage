package Vehicule;

import Moteur.Moteur;
import Vehicule.Options.iOption;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Morgan on 4/03/17.
 */
public abstract class Vehicule{
    protected String nom;
    protected Marque nomMarque;
    protected Moteur moteur;
    protected List<iOption> options = new LinkedList<iOption>();
    protected Double prix;

    public Vehicule(Moteur moteur){
        this.moteur = moteur;
    }

    // Custom
    public void addOption(iOption opt){
        this.options.add(opt);
    }

    // Setters
    public Moteur setMoteur(Moteur moteur){
        return this.moteur = moteur;
    }

    // Getters
    public String getNom(){
        return this.nom;
    }

    public String getMarque(){
        return this.nomMarque.getMarque();
    }

    public Moteur getMoteur(){
        return this.moteur;
    }

    public String getOptions(){
        String str = "";
        for(iOption option : this.options) {
            str += option + ", ";
        }
        return str;
    }

    public Double getPrix(){
        Double prix = this.prix;
        prix += this.moteur.getPrix();
        for(iOption opt : this.options){
            prix += opt.getPrix();
        }
        return prix;
    }

    // Default
    public String toString(){
        return ""+ this.getMarque() +" "+ this.getNom();
    }
}
