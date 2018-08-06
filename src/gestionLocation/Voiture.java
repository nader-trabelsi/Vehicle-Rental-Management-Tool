package gestionLocation;


// -------------------------------------------------------------
// ----------- © Nader Trabelsi - December 2017 ----------------
// -------------------------------------------------------------

import java.io.Serializable;

public class Voiture extends VehiculeTerrestre implements Serializable{

    private static final long serialVersionUID = 1L;

    private String marque;
    private String Modele;
    private int puissance;
    private int anneeFabri;

    public Voiture(int mat, String marque, String Modele, int puissance, int anneeFabri) {
        super(mat);
        this.marque = marque;
        this.Modele = Modele;
        this.puissance = puissance;
        this.anneeFabri = anneeFabri;
    }

    public Voiture() {
    }
    
    


    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return Modele;
    }

    public void setModele(String Modele) {
        this.Modele = Modele;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public int getAnneeFabri() {
        return anneeFabri;
    }

    public void setAnneeFabri(int anneeFabri) {
        this.anneeFabri = anneeFabri;
    }

    @Override
    public String toString() {
        return "Voiture{" + "mat=" + mat + ", marque=" + marque + ", Modele=" + Modele + ", puissance=" + puissance + ", anneeFabri=" + anneeFabri + '}';
    }
    

    @Override
    public int calculerPrixLocationJour() {
        return (int)(MIN_PRIX_LOCATION_JOUR*((float)puissance/20));
    }
    
}
