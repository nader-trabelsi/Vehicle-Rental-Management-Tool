// -------------------------------------------------------------
// ----------- © Nader Trabelsi - December 2017 ----------------
// -------------------------------------------------------------


package gestionLocation;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.*;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Font x1;
    @FXML
    private Button butRet;
    @FXML
    private Button butLoc;
    @FXML
    private Button butVehDis;
    @FXML
    private Button butAjout;
    @FXML
    private Button butLocRet;
    @FXML
    private AnchorPane apfxml;
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    public void butAjoutHandle(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ajout.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.getIcons().add(new Image("icone_voiture_byNader.png"));
            stage.setTitle("Ajout d'un vehicule");
            stage.setScene(new Scene(root1));
            stage.setResizable(false);
            stage.show();
        }
        catch(IOException e){e.printStackTrace();}
    }
    
    @FXML
    private void butRetHandle(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("retourner.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.getIcons().add(new Image("icone_voiture_byNader.png"));
            stage.setTitle("Retour d'un véhicule");
            stage.setScene(new Scene(root1));
            stage.setResizable(false);
            stage.show();
        }
        catch(IOException e){e.printStackTrace();}
    }
    
    @FXML
    private void butLocHandle(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("location.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.getIcons().add(new Image("icone_voiture_byNader.png"));
            stage.setTitle("Location d'un véhicule");
            stage.setScene(new Scene(root1));
            stage.setResizable(false);
            stage.show();
        }
        catch(IOException e){e.printStackTrace();}
    }
    
    @FXML
    private void butVehDisHandle(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("listVehDis.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.getIcons().add(new Image("icone_voiture_byNader.png"));
            stage.setTitle("Catalogue des véhicules");
            stage.setScene(new Scene(root1));
            stage.setResizable(false);
            stage.show();
        }
        catch(IOException e){e.printStackTrace();}
    }
    
    @FXML
    private void butLocRetHandle(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("listeRetard.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.getIcons().add(new Image("icone_voiture_byNader.png"));
            stage.setTitle("Liste des locations en retard");
            stage.setScene(new Scene(root1));
            stage.setResizable(false);
            stage.show();
        }
        catch(IOException e){e.printStackTrace();}
    }
    
    
}
