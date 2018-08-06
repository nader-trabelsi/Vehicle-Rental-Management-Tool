package gestionLocation;


// -------------------------------------------------------------
// ----------- © Nader Trabelsi - December 2017 ----------------
// -------------------------------------------------------------

import java.io.Serializable;
import java.util.Calendar;

public class Ballon extends VehiculeAerien implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private int Poids;
    private String marque;
    private int anneeFabri;

    public Ballon(int mat, int Poids, String marque, int anneeFabri) {
        super(mat);
        this.Poids = Poids;
        this.marque = marque;
        this.anneeFabri = anneeFabri;
    }

    public Ballon() {
    }


    public int getPoids() {
        return Poids;
    }

    public void setPoids(int Poids) {
        this.Poids = Poids;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getAnneeFabri() {
        return anneeFabri;
    }

    public void setAnneeFabri(int anneeFabri) {
        this.anneeFabri = anneeFabri;
    }

    public String toString() {
        return "Ballon{" + "mat=" + mat + ", Poids=" + Poids + ", marque=" + marque + ", anneeFabri=" + anneeFabri + '}';
    }
    

    public int calculerNombrePersonneMax() {
        return Poids*10/100;            
    }

    public int calculerPrixLocationJour() {
        return Vehicule.MIN_PRIX_LOCATION_JOUR+(Calendar.getInstance().get(Calendar.YEAR)-anneeFabri)*140;
    }
    
}
