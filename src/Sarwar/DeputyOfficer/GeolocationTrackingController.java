package Sarwar.DeputyOfficer;

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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sarwa
 */
public class GeolocationTrackingController implements Initializable {

    @FXML
    private WebView mapWebView;
    @FXML
    private TableView<?> trackerTableColumn;
    @FXML
    private TableColumn<?, ?> vehicleTrackTableColumn;
    @FXML
    private TableColumn<?, ?> eqpTrackTableColumn;
    @FXML
    private TableColumn<?, ?> persTrackTableColumn;
    @FXML
    private Button ReturnToDashboardButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void startTrackingOnClick(ActionEvent event) {
    }

    @FXML
    private void stopTrackingOnClick(ActionEvent event) {
    }

    @FXML
    private void ReturnToDashboardOnClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Sarwar/DeputyOfficer/DeputyOfficerDashboard.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ReturnToDashboardButton.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}
