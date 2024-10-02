// Programmer: Brett Loveday 12229250
// File: MainSceneController.java
// Date: 2024.09.11
// Purpose: COIT11134 Week 9 Lab Exercise
// Controlls the main GUI screen

package coit11134.staffphonebook;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;

public class MainSceneController implements Initializable {

    @FXML
    private TextArea txtOutput;
    @FXML
    private Button btnExit;
    @FXML
    private Button btnDisplay;
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnClear;
    @FXML
    private Button btnSave;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // nothing to initialise
    }

    // user presses the exit button
    @FXML
    private void exitAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to Close?");
        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                Platform.exit();
            }
        });
    }
    
    // user presses the display button
    @FXML
    private void displayAction(ActionEvent event) throws FileNotFoundException {
        //readDataFileAndDisplay();  // Part I
        System.out.println("You clicked on display");
        txtOutput.setText(App.getDataHandler().getDisplayOutput());
    }

    // user presses the add button
    @FXML
    private void addAction(ActionEvent event) {
        System.out.println("You clicked on Add!");
        //Switch to the AddNumber scene
        App.changeScene(1);
    }

    @FXML
    private void clearAction(ActionEvent event) {
        System.out.println("You clicked on Clear!");
        // Clears the text area
        txtOutput.setText("");
    }

    // user presses the save button
    @FXML
    private void saveAction(ActionEvent event) {
        System.out.println("You clicked on Save!");
        //All data saved to the text file
        App.getDataHandler().saveData();
    }

}
