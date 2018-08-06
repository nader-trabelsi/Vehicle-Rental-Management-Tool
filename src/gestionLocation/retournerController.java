// -------------------------------------------------------------
// ----------- © Nader Trabelsi - December 2017 ----------------
// -------------------------------------------------------------
package gestionLocation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * FXML Controller class
 *
 * @author Nader
 */
public class retournerController implements Initializable {
    
    @FXML
    private Color x1;
    @FXML
    private AnchorPane apRetour;
    @FXML
    private Button butRet;
    @FXML
    private ComboBox<Integer> listVehLoue;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            listVehLoue.getItems().clear();
            ArrayList<Location> listeLoc=AccessFichiers.recupererListe("locations","locations.tmp");
            for (Location l:listeLoc){
                listVehLoue.getItems().add(l.getV().getMat());
            }
        } catch (IOException ex) {
            Logger.getLogger(retournerController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(retournerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void butRetHandle(ActionEvent event) throws IOException, FileNotFoundException, ClassNotFoundException {
        if (!listVehLoue.getSelectionModel().isEmpty()){
            ArrayList<Vehicule> listeVehicule=AccessFichiers.recupererListe("vehicules","vehicules.tmp");
            ArrayList<Location> listeLoc = AccessFichiers.recupererListe("locations","locations.tmp");
            
            int m = listVehLoue.getValue();
            boolean exist=false;
            for(Location loc:listeLoc){
                if(loc.getV().getMat()==m){
                    exist=true;
                }
            }
            
            if(!exist){
                Alert erreur = new Alert(Alert.AlertType.WARNING);
                erreur.setTitle("Attention!");
                erreur.setHeaderText("Impossible de retourner ce véhicule");
                erreur.setContentText("La véhicule avec la matricule "+m+" n'a pas été loué pour étre retourné!");
                erreur.showAndWait();
            } else {
                int iSupLoc=0;
                Vehicule vRet=null;
                for(int i=0;i<listeLoc.size();i++){
                    if(listeLoc.get(i).getV().getMat()==m){
                        iSupLoc=i;
                        vRet=listeLoc.get(i).getV();
                    }
                }
                listeLoc.remove(iSupLoc);
                listeVehicule.add(vRet);
                
                AccessFichiers.enregistrerListe(listeVehicule,"vehicules");
                AccessFichiers.enregistrerListe(listeLoc,"locations");
                
                Alert ok = new Alert(Alert.AlertType.INFORMATION);
                ok.setTitle("Opération réussie");
                ok.setHeaderText("Le véhicule a été bien retourné");
                ok.showAndWait();
            }
        }
        listVehLoue.getItems().clear();
        ArrayList<Location> listeLoc=AccessFichiers.recupererListe("locations","locations.tmp");
        for (Location l:listeLoc){
            listVehLoue.getItems().add(l.getV().getMat());
        }
    }
    
}
