package gestionLocation;


// -------------------------------------------------------------
// ----------- © Nader Trabelsi - December 2017 ----------------
// -------------------------------------------------------------

import java.io.Serializable;

public class Camion extends  VehiculeTerrestre implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String marque;
    private String Modele;
    private int puissance;
    private int anneeFabri;
    private int chargeMax;

    public Camion(int mat, String marque, String Modele, int puissance, int anneeFabri, int chargeMax) {
        super(mat);
        this.marque = marque;
        this.Modele = Modele;
        this.puissance = puissance;
        this.anneeFabri = anneeFabri;
        this.chargeMax = chargeMax;
    }

    public Camion(int mat) {
        super(mat);
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

    public int getChargeMax() {
        return chargeMax;
    }

    public void setChargeMax(int chargeMax) {
        this.chargeMax = chargeMax;
    }

    @Override
    public String toString() {
        return "Camion{" + "mat=" + mat + ", marque=" + marque + ", Modele=" + Modele + ", puissance=" + puissance + ", anneeFabri=" + anneeFabri + ", chargeMax=" + chargeMax + '}';
    }

    @Override
    public int calculerPrixLocationJour() {
        return Vehicule.MIN_PRIX_LOCATION_JOUR*(chargeMax/500);
    }
    
}
