// -------------------------------------------------------------
// ----------- © Nader Trabelsi - December 2017 ----------------
// -------------------------------------------------------------
package gestionLocation;
import java.io.*;
import java.util.*;

public class AccessFichiers {
    
    public static ArrayList recupererListe(String donneeARecuperer,String fichier) throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList liste = new ArrayList();
        try{
            File f = new File(fichier);
            if(f.exists()){
                FileInputStream fin = new FileInputStream(fichier);
                ObjectInputStream ois = new ObjectInputStream(fin);
                switch(donneeARecuperer){
                    case "vehicules":liste = (ArrayList<Vehicule>) (ois.readObject()); break;
                    case "locations":liste = (ArrayList<Location>) (ois.readObject()); break;
                    default: break;
                }
                ois.close();fin.close();
            } else {
                liste = new ArrayList();
            }
        } catch(EOFException e){e.printStackTrace();}
        return liste;
    }
    
    public static void enregistrerListe(ArrayList liste,String donnee){
        try{
            FileOutputStream fos;
            switch(donnee){
                case "locations":fos = new FileOutputStream("locations.tmp");break;
                case "vehicules":fos = new FileOutputStream("vehicules.tmp");break;
                default: fos=new FileOutputStream("");break;
            }
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(liste);
            oos.close();fos.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
    

   
}
