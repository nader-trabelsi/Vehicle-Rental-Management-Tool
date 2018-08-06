package gestionLocation;


// -------------------------------------------------------------
// ----------- © Nader Trabelsi - December 2017 ----------------
// -------------------------------------------------------------

import java.io.Serializable;

public abstract class VehiculeAerien extends Vehicule implements Serializable{

    private static final long serialVersionUID = 1L;


    public VehiculeAerien(int mat) {
        super(mat);
    }

    public VehiculeAerien() {
    }
    
    
    abstract int calculerNombrePersonneMax();
}
