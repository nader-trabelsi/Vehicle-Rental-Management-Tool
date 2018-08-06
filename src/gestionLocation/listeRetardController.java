// -------------------------------------------------------------
// ----------- © Nader Trabelsi - December 2017 ----------------
// -------------------------------------------------------------
package gestionLocation;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;


public class listeRetardController implements Initializable {
    
    @FXML
    private AnchorPane apListeRet;
    @FXML
    private ListView<String> lvListeRetard;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ArrayList<Location> listeLoc=null;
        ArrayList<String> descLoc= new ArrayList<String>();
        try {
            listeLoc = AccessFichiers.recupererListe("locations","locations.tmp");
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(listeRetardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(Location l:listeLoc){
            if(l.enRetard()) descLoc.add(l.toString());
        }
        
        ObservableList<String> items =FXCollections.observableArrayList (descLoc);
        
        lvListeRetard.setItems(items);
    }
    
    
}
