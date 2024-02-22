/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sarwa
 */
public class EventManagmentController implements Initializable {

    @FXML
    private TableView<?> eventTableColumn;
    @FXML
    private TableColumn<?, ?> eventIDTableColumn;
    @FXML
    private TableColumn<?, ?> eventNameTableColumn;
    @FXML
    private TableColumn<?, ?> eventDateTableColumn;
    @FXML
    private TextArea eventDetailsTextArea;
    @FXML
    private TextField eventIDTextField;
    @FXML
    private TextField eventNameTextField;
    @FXML
    private DatePicker eventDatePicker;
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

    @FXML
    private void createEventOnClick(ActionEvent event) {
    }

    @FXML
    private void deleteEventOnClick(ActionEvent event) {
    }

    @FXML
    private void editEventOnClick(ActionEvent event) {
    }
    
}
