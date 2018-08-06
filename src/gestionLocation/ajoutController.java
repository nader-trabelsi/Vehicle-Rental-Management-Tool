// -------------------------------------------------------------
// ----------- © Nader Trabelsi - December 2017 ----------------
// -------------------------------------------------------------
package gestionLocation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Alert.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;


public class ajoutController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Font x1;
    @FXML
    private Color x2;
    @FXML
    private ToggleGroup typeVehicule;
    @FXML
    private AnchorPane apAjout;
    @FXML
    private RadioButton rbVoiture;
    @FXML
    private RadioButton rbCamion;
    @FXML
    private RadioButton rbMoto;
    @FXML
    private RadioButton rbYacht;
    @FXML
    private RadioButton rbVoilier;
    @FXML
    private RadioButton rbAvion;
    @FXML
    private RadioButton rbBallon;
    @FXML
    private RadioButton rbHeli;
    @FXML
    private Font x3;
    @FXML
    private TextField tfMat;
    @FXML
    private TextField tfnbPlaces;
    @FXML
    private TextField tfPoids;
    @FXML
    private TextField tfMarque;
    @FXML
    private TextField tfAnnee;
    @FXML
    private TextField tfPuiss;
    @FXML
    private TextField tfModele;
    @FXML
    private TextField tfCharge;
    @FXML
    private TextField tfVitesse;
    @FXML
    private TextField tfnbVoiles;
    @FXML
    private TextField tfLong;
    @FXML
    private TextField tfLargeur;
    @FXML
    private Button butEffAjout;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tfPuiss.setDisable(false);
        tfAnnee.setDisable(false);
        tfnbPlaces.setDisable(true);
        tfPoids.setDisable(true);
        tfMarque.setDisable(false);
        tfModele.setDisable(false);
        tfCharge.setDisable(true);
        tfVitesse.setDisable(true);
        tfnbVoiles.setDisable(true);
        tfLargeur.setDisable(true);
        tfLong.setDisable(true);
        
        ArrayList<TextField> listeTFNum = new ArrayList<>();
        listeTFNum.add(tfMat);
        listeTFNum.add(tfPuiss);
        listeTFNum.add(tfAnnee);
        listeTFNum.add(tfnbPlaces);
        listeTFNum.add(tfPoids);
        listeTFNum.add(tfCharge);
        listeTFNum.add(tfVitesse);
        listeTFNum.add(tfnbVoiles);
        listeTFNum.add(tfLargeur);
        listeTFNum.add(tfLong);
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
    }
    
    @FXML
    private void rbVoitureHandle(ActionEvent event) {
        tfPuiss.setDisable(false);
        tfAnnee.setDisable(false);
        tfnbPlaces.setDisable(true);
        tfPoids.setDisable(true);
        tfMarque.setDisable(false);
        tfModele.setDisable(false);
        tfCharge.setDisable(true);
        tfVitesse.setDisable(true);
        tfnbVoiles.setDisable(true);
        tfLargeur.setDisable(true);
        tfLong.setDisable(true);
    }
    
    @FXML
    private void rbCamionHandle(ActionEvent event) {
        tfPuiss.setDisable(false);
        tfAnnee.setDisable(false);
        tfnbPlaces.setDisable(true);
        tfPoids.setDisable(true);
        tfMarque.setDisable(false);
        tfModele.setDisable(false);
        tfCharge.setDisable(false);
        tfVitesse.setDisable(true);
        tfnbVoiles.setDisable(true);
        tfLargeur.setDisable(true);
        tfLong.setDisable(true);
    }
    
    @FXML
    private void rbMotoHandle(ActionEvent event) {
        tfPuiss.setDisable(true);
        tfAnnee.setDisable(false);
        tfnbPlaces.setDisable(true);
        tfPoids.setDisable(true);
        tfMarque.setDisable(false);
        tfModele.setDisable(false);
        tfCharge.setDisable(true);
        tfVitesse.setDisable(false);
        tfnbVoiles.setDisable(true);
        tfLargeur.setDisable(true);
        tfLong.setDisable(true);
    }
    
    @FXML
    private void rbYachtHandle(ActionEvent event) {
        tfPuiss.setDisable(false);
        tfAnnee.setDisable(false);
        tfnbPlaces.setDisable(true);
        tfPoids.setDisable(true);
        tfMarque.setDisable(false);
        tfModele.setDisable(false);
        tfCharge.setDisable(true);
        tfVitesse.setDisable(true);
        tfnbVoiles.setDisable(true);
        tfLargeur.setDisable(false);
        tfLong.setDisable(false);
    }
    
    @FXML
    private void rbVoilierHandle(ActionEvent event) {
        tfPuiss.setDisable(true);
        tfAnnee.setDisable(false);
        tfnbPlaces.setDisable(true);
        tfPoids.setDisable(true);
        tfMarque.setDisable(false);
        tfModele.setDisable(false);
        tfCharge.setDisable(true);
        tfVitesse.setDisable(false);
        tfnbVoiles.setDisable(false);
        tfLargeur.setDisable(false);
        tfLong.setDisable(false);
    }
    
    @FXML
    private void rbAvionHandle(ActionEvent event) {
        tfPuiss.setDisable(true);
        tfAnnee.setDisable(false);
        tfnbPlaces.setDisable(false);
        tfPoids.setDisable(false);
        tfMarque.setDisable(false);
        tfModele.setDisable(true);
        tfCharge.setDisable(true);
        tfVitesse.setDisable(true);
        tfnbVoiles.setDisable(true);
        tfLargeur.setDisable(true);
        tfLong.setDisable(true);
    }
    
    @FXML
    private void rbBallonHandle(ActionEvent event) {
        tfPuiss.setDisable(true);
        tfAnnee.setDisable(false);
        tfnbPlaces.setDisable(true);
        tfPoids.setDisable(false);
        tfMarque.setDisable(false);
        tfModele.setDisable(true);
        tfCharge.setDisable(true);
        tfVitesse.setDisable(true);
        tfnbVoiles.setDisable(true);
        tfLargeur.setDisable(true);
        tfLong.setDisable(true);
    }
    
    @FXML
    private void rbHeliHandle(ActionEvent event) {
        tfPuiss.setDisable(false);
        tfAnnee.setDisable(false);
        tfnbPlaces.setDisable(true);
        tfPoids.setDisable(false);
        tfMarque.setDisable(false);
        tfModele.setDisable(true);
        tfCharge.setDisable(true);
        tfVitesse.setDisable(true);
        tfnbVoiles.setDisable(true);
        tfLargeur.setDisable(true);
        tfLong.setDisable(true);
    }
    
    @FXML
    private void butEffAjoutHandle(ActionEvent event) throws IOException, FileNotFoundException, ClassNotFoundException {
        if(!(tfMat.getText().isEmpty())){
            boolean formulaireRempli = false;
            ArrayList<Vehicule> listeVehicule = AccessFichiers.recupererListe("vehicules", "vehicules.tmp");
            Vehicule v = new Vehicule();
            
            
            int mat = Integer.parseInt(tfMat.getText());
            int nbPlaces,Poids,annee,puis,charge,vit,nbVoiles,larg,lon;
            
            if(rbVoiture.isSelected() && !tfMarque.getText().isEmpty() && !tfModele.getText().isEmpty() && !tfPuiss.getText().isEmpty() && !tfAnnee.getText().isEmpty()){
                v = new Voiture(mat,tfMarque.getText(),tfModele.getText(),Integer.parseInt(tfPuiss.getText()),Integer.parseInt(tfAnnee.getText()));
                formulaireRempli=true;
            }
            
            if(rbCamion.isSelected() && !tfMarque.getText().isEmpty() && !tfModele.getText().isEmpty() && !tfPuiss.getText().isEmpty() && !tfAnnee.getText().isEmpty() && !tfCharge.getText().isEmpty()){
                v = new Camion(mat,tfMarque.getText(),tfModele.getText(),Integer.parseInt(tfPuiss.getText()),Integer.parseInt(tfAnnee.getText()),Integer.parseInt(tfCharge.getText()));
                formulaireRempli=true;
            }
            
            if(rbMoto.isSelected() && !tfMarque.getText().isEmpty() && !tfModele.getText().isEmpty() && !tfVitesse.getText().isEmpty() && !tfAnnee.getText().isEmpty()){
                v = new Moto(mat,tfMarque.getText(),tfModele.getText(),Integer.parseInt(tfVitesse.getText()),Integer.parseInt(tfAnnee.getText()));
                formulaireRempli=true;
            }
            
            if(rbYacht.isSelected() && !tfMarque.getText().isEmpty() && !tfModele.getText().isEmpty() && !tfLargeur.getText().isEmpty() && !tfLong.getText().isEmpty() && !tfAnnee.getText().isEmpty() && !tfPuiss.getText().isEmpty()){
                v = new Yacht(mat,tfMarque.getText(),tfModele.getText(),Integer.parseInt(tfLargeur.getText()),Integer.parseInt(tfLong.getText()),Integer.parseInt(tfAnnee.getText()),Integer.parseInt(tfPuiss.getText()));
                formulaireRempli=true;
            }
            
            if(rbVoilier.isSelected() && !tfMarque.getText().isEmpty() && !tfModele.getText().isEmpty() && !tfnbVoiles.getText().isEmpty() && !tfLargeur.getText().isEmpty() && !tfLong.getText().isEmpty()){
                v = new Voilier(mat,tfMarque.getText(),tfModele.getText(),Integer.parseInt(tfnbVoiles.getText()),Integer.parseInt(tfLargeur.getText()),Integer.parseInt(tfLong.getText()));
                formulaireRempli=true;
            }
            
            if(rbAvion.isSelected() && !tfnbPlaces.getText().isEmpty() && !tfPoids.getText().isEmpty() && !tfMarque.getText().isEmpty() && !tfAnnee.getText().isEmpty()){
                v = new Avion(mat,Integer.parseInt(tfnbPlaces.getText()),Integer.parseInt(tfPoids.getText()),tfMarque.getText(),Integer.parseInt(tfAnnee.getText()));
                formulaireRempli=true;
            }
            
            if(rbBallon.isSelected() && !tfPoids.getText().isEmpty() && !tfMarque.getText().isEmpty() && !tfAnnee.getText().isEmpty()){
                v = new Ballon(mat,Integer.parseInt(tfPoids.getText()),tfMarque.getText(),Integer.parseInt(tfAnnee.getText()));
                formulaireRempli=true;
            }
            
            if(rbHeli.isSelected() && !tfPoids.getText().isEmpty() && !tfMarque.getText().isEmpty() && !tfPuiss.getText().isEmpty() && !tfAnnee.getText().isEmpty()){
                v = new Helicoptere(mat,Integer.parseInt(tfPoids.getText()),tfMarque.getText(),Integer.parseInt(tfPuiss.getText()),Integer.parseInt(tfAnnee.getText()));
                formulaireRempli=true;
            }
            if(formulaireRempli){
                
                boolean exist=false;
                if(listeVehicule.isEmpty()==false){
                    for (Vehicule veh:listeVehicule){
                        if(veh.getMat()==v.getMat()){
                            exist=true;break;
                        }
                    }
                }
                if(!exist){
                    listeVehicule.add(v);
                    AccessFichiers.enregistrerListe(listeVehicule,"vehicules");
                    Alert ok = new Alert(AlertType.INFORMATION);
                    ok.setTitle("Opération réussie");
                    ok.setHeaderText("L'ajout de véhicule a été effectué avec succés");
                    ok.showAndWait();
                } else {
                    Alert erreur = new Alert(AlertType.WARNING);
                    erreur.setTitle("Attention!");
                    erreur.setHeaderText("Impossible d'ajouter ce véhicule");
                    erreur.setContentText("Un véhicule avec avec la meme matricule existe déjà dans la base de données");
                    erreur.showAndWait();
                }
            }
            
            
            
        }
    }
    
}
