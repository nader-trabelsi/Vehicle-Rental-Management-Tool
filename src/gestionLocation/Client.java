package gestionLocation;


// -------------------------------------------------------------
// ----------- © Nader Trabelsi - December 2017 ----------------
// -------------------------------------------------------------


import java.io.Serializable;

public class Client implements Serializable{

    private static final long serialVersionUID = 1L;
    private int CIN;
    private String nom;
    private String prenom;

    public Client(int CIN, String nom, String prenom) {
        this.CIN = CIN;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getCIN() {
        return CIN;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setCIN(int CIN) {
        this.CIN = CIN;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Client{" + "CIN=" + CIN + ", nom=" + nom + ", prenom=" + prenom + '}';
    }
    
    
    
    
}
