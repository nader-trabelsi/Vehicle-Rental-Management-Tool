package gestionLocation;


// -------------------------------------------------------------
// ----------- © Nader Trabelsi - December 2017 ----------------
// -------------------------------------------------------------

import java.io.Serializable;
import java.util.Calendar;

public class Voilier extends VehiculeMarin implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private String marque;
    private String modele;
    private int nbVoiles;
    private int largeur;
    private int longueur;
    private int anneeFab;

    public Voilier(int mat, String marque, String modele, int nbVoiles, int largeur, int longueur) {
        super(mat);
        this.marque = marque;
        this.modele = modele;
        this.nbVoiles = nbVoiles;
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public Voilier() {
    }
    
    


    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getNbVoiles() {
        return nbVoiles;
    }

    public void setNbVoiles(int nbVoiles) {
        this.nbVoiles = nbVoiles;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getAnneeFab() {
        return anneeFab;
    }

    public void setAnneeFab(int anneeFab) {
        this.anneeFab = anneeFab;
    }
    
    

    @Override
    public int calculerVitesseMax() { // Vitesse Max Recommandé
        return nbVoiles*20+(largeur/longueur);
    }

    @Override
    public int calculerPrixLocationJour() {
        return MIN_PRIX_LOCATION_JOUR+(Calendar.getInstance().get(Calendar.YEAR)-anneeFab)*600;
    }

    @Override
    public String toString() {
        return "Voilier{" + "mat=" + mat + ", marque=" + marque + ", modele=" + modele + ", nbVoiles=" + nbVoiles + ", largeur=" + largeur + ", longueur=" + longueur + ",vitesse max=" + calculerVitesseMax()+'}';
    }
    
    
}
