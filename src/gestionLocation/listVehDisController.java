// -------------------------------------------------------------
// ----------- © Nader Trabelsi - December 2017 ----------------
// -------------------------------------------------------------
package gestionLocation;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.collections.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class listVehDisController implements Initializable {
    
    @FXML
    private AnchorPane apLVehDis;
    @FXML
    private ListView<String> lvListVehDis;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<Vehicule> listVeh=null;
        ArrayList<String> descVeh= new ArrayList<String>();
        try {
            listVeh = AccessFichiers.recupererListe("vehicules", "vehicules.tmp");
        } catch (IOException ex) {
            Logger.getLogger(listVehDisController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(listVehDisController.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Vehicule veh : listVeh) {
            descVeh.add(veh.toString());
        }
        ObservableList<String> items =FXCollections.observableArrayList (descVeh);
        
        lvListVehDis.setItems(items);
    }
    
    
    
}
