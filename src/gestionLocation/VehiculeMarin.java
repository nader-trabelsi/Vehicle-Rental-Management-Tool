package gestionLocation;


// -------------------------------------------------------------
// ----------- © Nader Trabelsi - December 2017 ----------------
// -------------------------------------------------------------

import java.io.Serializable;

public abstract class VehiculeMarin extends Vehicule implements Serializable{

    private static final long serialVersionUID = 1L;


    public VehiculeMarin(int mat) {
        super(mat);
    }

    public VehiculeMarin() {
    }
    
    
    abstract int calculerVitesseMax();
    
    
}
