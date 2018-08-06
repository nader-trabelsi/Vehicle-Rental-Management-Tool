package gestionLocation;

// -------------------------------------------------------------
// ----------- © Nader Trabelsi - December 2017 ----------------
// -------------------------------------------------------------

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Location implements Serializable{

    private static final long serialVersionUID = 1L;
    private Client clt;
    private Vehicule vehi;
    private Date dateLoc;
    private int Duree;

    public Location(Client clt, Vehicule v, int Duree) {
        this.clt = clt;
        vehi = v;
        this.Duree = Duree;
        Calendar aujourdhui = Calendar.getInstance();
        dateLoc =  aujourdhui.getTime();
    }
    
    public boolean enRetard(){
        Calendar c = Calendar.getInstance();
        Date dateAuj =  c.getTime();
        if(dateAuj.getTime()>(dateLoc.getTime() + 24 * 60 * 60 * 1000 * Duree)) return true;
        else {return false;}
    }

    public Client getClt() {
        return clt;
    }

    public void setClt(Client clt) {
        this.clt = clt;
    }

    public Vehicule getV() {
        return vehi;
    }

    public void setV(Vehicule v) {
        this.vehi = v;
    }

    public int getDuree() {
        return Duree;
    }

    public void setDuree(int Duree) {
        this.Duree = Duree;
    }

    @Override
    public String toString() {
        return "Location{\n" + "clt=" + clt.toString() + "\n, vehi=" + vehi.toString() + "\n, dateLoc=" + dateLoc + ", Duree=" + Duree + '}';
    }
    
    
    
    
}
