package gestionLocation;


// -------------------------------------------------------------
// ----------- © Nader Trabelsi - December 2017 ----------------
// -------------------------------------------------------------

import java.io.Serializable;

public class Moto extends VehiculeTerrestre implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private String marque;
    private String Modele;
    private int vitesse;
    private int anneeFabri;

    public Moto(int mat, String marque, String Modele, int vitesse, int anneeFabri) {
        super(mat);
        this.marque = marque;
        this.Modele = Modele;
        this.vitesse = vitesse;
        this.anneeFabri = anneeFabri;
    }

    public Moto() {
    }

    
    
    


    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModel() {
        return Modele;
    }

    public void setModel(String Modele) {
        this.Modele = Modele;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public int getAnneeFabri() {
        return anneeFabri;
    }

    public void setAnneeFabri(int anneeFabri) {
        this.anneeFabri = anneeFabri;
    }

    @Override
    public String toString() {
        return "Moto{" + "mat=" + mat + ", marque=" + marque + ", Modele=" + Modele + ", vitesse=" + vitesse + ", anneeFabri=" + anneeFabri + '}';
    }
    
    @Override
    public int calculerPrixLocationJour() {
        return MIN_PRIX_LOCATION_JOUR*(vitesse*(1/100));
    }
    
}
