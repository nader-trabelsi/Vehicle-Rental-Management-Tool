package gestionLocation;


// -------------------------------------------------------------
// ----------- © Nader Trabelsi - December 2017 ----------------
// -------------------------------------------------------------

import java.io.Serializable;
import java.util.Calendar;

public class Helicoptere extends VehiculeAerien implements Serializable{

    private static final long serialVersionUID = 1L;

    private int Poids;
    private String marque;
    private int Puissance;
    private int anneeFabri;

    public Helicoptere(int mat, int Poids, String marque, int Puissance, int anneeFabri) {
        super(mat);
        this.Poids = Poids;
        this.marque = marque;
        this.Puissance = Puissance;
        this.anneeFabri = anneeFabri;
    }

    public Helicoptere() {
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

    public int getPuissance() {
        return Puissance;
    }

    public void setPuissance(int Puissance) {
        this.Puissance = Puissance;
    }

    public int getAnneeFabri() {
        return anneeFabri;
    }

    public void setAnneeFabri(int anneeFabri) {
        this.anneeFabri = anneeFabri;
    }

    @Override
    public String toString() {
        return "Helicoptere{" + "mat=" + mat + ", Poids=" + Poids + ", marque=" + marque + ", Puissance=" + Puissance + ", anneeFabri=" + anneeFabri + '}';
    }
    

    @Override
    public int calculerNombrePersonneMax() {
        return   Puissance*(10/100)*(Poids*10/1000);           
    }

    @Override
    public int calculerPrixLocationJour() {
        return  MIN_PRIX_LOCATION_JOUR+(Calendar.getInstance().get(Calendar.YEAR)-anneeFabri)*1900;       
    }
    
}
