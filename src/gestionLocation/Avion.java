package gestionLocation;


// -------------------------------------------------------------
// ----------- © Nader Trabelsi - December 2017 ----------------
// -------------------------------------------------------------

import java.io.Serializable;
import java.util.Calendar;

public class Avion extends VehiculeAerien implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private int nbPlaces;
    private int Poids;
    private String marque;
    private int anneeFabri;

    public Avion(int mat, int nbPlaces, int Poids, String marque, int anneeFabri) {
        super(mat);
        this.nbPlaces = nbPlaces;
        this.Poids = Poids;
        this.marque = marque;
        this.anneeFabri = anneeFabri;
    }

    public Avion() {
    }

   


    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
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

    @Override
    public String toString() {
        return "Avion{" + "mat=" + mat + ", nbPlaces=" + nbPlaces + ", Poids=" + Poids + ", marque=" + marque + ", anneeFabri=" + anneeFabri + '}';
    }
    

    @Override
    public int calculerNombrePersonneMax() {
        return nbPlaces-((Poids*10)/100);
    }

    @Override
    public int calculerPrixLocationJour() {
        return Vehicule.MIN_PRIX_LOCATION_JOUR+(int)((float)(1/(Calendar.getInstance().get(Calendar.YEAR)-anneeFabri)))*4000;
    }
    
}
