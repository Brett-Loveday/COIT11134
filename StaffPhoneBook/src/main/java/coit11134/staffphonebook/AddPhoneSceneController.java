// Programmer: Brett Loveday 12229250
// File: AddPhoneSceneController.java
// Date: 2024.09.11
// Purpose: COIT11134 Week 9 Lab Exercise
// Controls the add new phone number GUI screen

package coit11134.staffphonebook;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AddPhoneSceneController implements Initializable {

    @FXML
    private Button btnCancel;
    @FXML
    private Button btnSubmit;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtPhone;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // nothing to initialise
    }

    // user presses the cancel button
    @FXML
    private void cancelAction(ActionEvent event) {
        System.out.println("You clicked on Cancel!");
        //Returns to the Main scene
        App.changeScene(0);
    }

    // user presses the submit button
    @FXML
    private void submitAction(ActionEvent event) {
        System.out.println("You clicked on Add!");
        if (!txtName.getText().equals("") && !txtPhone.getText().equals("")) {
            PhoneNumber ph = new PhoneNumber(txtName.getText(), txtPhone.getText());
            // Adding the employee phone number to the PhoneNo ArrayList
            App.getDataHandler().addPhoneNo(ph);
            //Return to the Main scene
            App.changeScene(0);
        } else {
            System.out.println("All fields must be completed");
        }

    }

}
