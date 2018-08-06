package gestionLocation;


// -------------------------------------------------------------
// ----------- © Nader Trabelsi - December 2017 ----------------
// -------------------------------------------------------------

import java.io.Serializable;
import java.util.Calendar;

public class Yacht extends VehiculeMarin implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private String marque;
    private String modele;
    private int largeur;
    private int longueur;
    private int anneeFab;
    private int puissance;

    public Yacht(int mat, String marque, String modele, int largeur, int longueur, int anneeFab, int puissance) {
        super(mat);
        this.marque = marque;
        this.modele = modele;
        this.largeur = largeur;
        this.longueur = longueur;
        this.anneeFab = anneeFab;
        this.puissance = puissance;
    }

    public Yacht() {
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

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    @Override
    public String toString() {
        return "Yacht{" + "mat=" + mat + ", marque=" + marque + ", modele=" + modele + ", largeur=" + largeur + ", longueur=" + longueur + ", anneeFab=" + anneeFab + ", puissance=" + puissance + '}';
    }
    
    

    @Override
    public int calculerVitesseMax() {
        return 30*puissance;
    }

    @Override
    public int calculerPrixLocationJour() {
        return MIN_PRIX_LOCATION_JOUR*(Calendar.getInstance().get(Calendar.YEAR)-anneeFab)*1700;
    }
    
}
