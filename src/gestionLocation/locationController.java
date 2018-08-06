// -------------------------------------------------------------
// ----------- © Nader Trabelsi - December 2017 ----------------
// -------------------------------------------------------------
package gestionLocation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.Scanner;
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


public class locationController implements Initializable {
    
    @FXML
    private Font x1;
    @FXML
    private Color x2;
    @FXML
    private Font x3;
    @FXML
    private TextField tfCIN;
    @FXML
    private TextField tfNom;
    @FXML
    private TextField tfPrenom;
    @FXML
    private TextField tfDuree;
    @FXML
    private Button butLouer;
    @FXML
    private AnchorPane apLoc;
    
    ArrayList<TextField> listeTF = new ArrayList<>();
    @FXML
    private ComboBox<Integer> listVehChoix;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        try {listeTF.add(tfDuree);
        listeTF.add(tfCIN);listeTF.add(tfNom);listeTF.add(tfPrenom);
        
        ArrayList<TextField> listeTFNum = new ArrayList<>();
        
        listVehChoix.getItems().clear();
        ArrayList<Vehicule> listeVehicule=AccessFichiers.recupererListe("vehicules","vehicules.tmp");
        for (Vehicule v:listeVehicule){
            listVehChoix.getItems().add(v.getMat());
        }
        listeTFNum.add(tfCIN);
        listeTFNum.add(tfDuree);
        for(TextField tf:listeTFNum){
            tf.textProperty().addListener(new ChangeListener<String>() {
                @Override
                public void changed(ObservableValue<? extends String> observable, String oldValue,
                        String newValue) {
                    if (!newValue.matches("\\d*")) {
                        tf.setText(newValue.replaceAll("[^\\d]", ""));
                    }
                }
            });
        }
        } catch (IOException ex) {
            Logger.getLogger(locationController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(locationController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @FXML
    private void butLouerHandle(ActionEvent event) throws IOException, FileNotFoundException, ClassNotFoundException {
        boolean formulaireRempli = true;
        for (TextField tf: listeTF){
            if(tf.getText().isEmpty()){
                formulaireRempli=false;break;
            }
        }
        if(formulaireRempli && !(listVehChoix.getSelectionModel().isEmpty())){
            ArrayList<Vehicule> listeVehicule=AccessFichiers.recupererListe("vehicules","vehicules.tmp");
            
            int m = listVehChoix.getValue();
            
            boolean exist = false;
            for(Vehicule ve:listeVehicule){
                if(ve.getMat()==m) {exist=true; break;}
            }
            
            if(exist){
                int iSupp=0;
                for(int i=0;i<listeVehicule.size();i++){
                    if(listeVehicule.get(i).getMat()==m){
                        iSupp=i;
                    }
                }
                
                Location l = new Location(new Client(Integer.parseInt(tfCIN.getText()),tfNom.getText(),tfPrenom.getText()),listeVehicule.get(iSupp),Integer.parseInt(tfDuree.getText()));
                
                String date = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date());
                String fichierRecu="recusLocations\\loc_CIN"+tfCIN.getText()+"_MAT"+m+"_"+date+".txt";
                try (PrintWriter writer = new PrintWriter(fichierRecu, "UTF-8")) {
                    writer.println("**** Informations Client ****");
                    writer.println("- CIN: "+tfCIN.getText());
                    writer.println("- Nom: "+tfNom.getText());
                    writer.println("- Prénom: "+tfPrenom.getText());
                    writer.println("**** Informations Vehicule ****");
                    writer.println("Matricule: "+m);
                    writer.println("**** Informations Location ****");
                    writer.println("La date et l'horaire: "+date);
                    writer.println("Duree: "+tfDuree.getText()+" jours");
                    writer.println("**** Paiement ****");
                    writer.println("Total: "+Integer.parseInt(tfDuree.getText())*listeVehicule.get(iSupp).calculerPrixLocationJour()+" DT");
                    writer.close();
                }
                listeVehicule.remove(iSupp);
                
                ArrayList<Location> listeLoc =AccessFichiers.recupererListe("locations","locations.tmp");
                listeLoc.add(l);
                AccessFichiers.enregistrerListe(listeLoc,"locations");
                AccessFichiers.enregistrerListe(listeVehicule, "vehicules");
                Alert ok = new Alert(Alert.AlertType.INFORMATION);
                ok.setTitle("Opération réussie");
                ok.setHeaderText("La location a été bien enregistrée");
                String recu = new Scanner(new File(fichierRecu)).useDelimiter("\\Z").next();
                ok.setContentText(recu);
                ok.showAndWait();
            } else {
                Alert erreur = new Alert(Alert.AlertType.WARNING);
                erreur.setTitle("Attention!");
                erreur.setHeaderText("Impossible d'effectuer cette location");
                erreur.setContentText("La véhicule avec la matricule "+m+" n'est pas disponible!");
                erreur.showAndWait();
            }
        }
        
        listVehChoix.getItems().clear();
        ArrayList<Vehicule> listeVehicule=AccessFichiers.recupererListe("vehicules","vehicules.tmp");
        for (Vehicule v:listeVehicule){
            listVehChoix.getItems().add(v.getMat());
        }
        
    }
    
}
