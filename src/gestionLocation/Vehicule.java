package gestionLocation;


// -------------------------------------------------------------
// ----------- © Nader Trabelsi - December 2017 ----------------
// -------------------------------------------------------------

import java.io.Serializable;

public class Vehicule implements Serializable {
    final static int MIN_PRIX_LOCATION_JOUR=200;
    int calculerPrixLocationJour(){return MIN_PRIX_LOCATION_JOUR;};
    protected int mat;
    
    public Vehicule(int mat){
        this.mat=mat;
    }
    public Vehicule(){
        
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }
    
    
}
