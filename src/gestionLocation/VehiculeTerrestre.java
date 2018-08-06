package gestionLocation;


// -------------------------------------------------------------
// ----------- © Nader Trabelsi - December 2017 ----------------
// -------------------------------------------------------------

import java.io.Serializable;

public abstract class VehiculeTerrestre extends Vehicule implements Serializable {

    private static final long serialVersionUID = 1L;

    
    public VehiculeTerrestre(int mat) {
        super(mat);
    }

    public VehiculeTerrestre() {
    }
    
    
    
}
