package org.example.librarymanagementsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField UserName;

    @FXML
    private PasswordField Password;

    @FXML
    private void LoginButton(ActionEvent event) {
        String username = UserName.getText();
        String password = Password.getText();

        // Check credentials
        if (username.equals("akram") && password.equals("123")) {
            // Load the FXML file for the main page
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
            try {
                // Load the parent node of the FXML file
                Parent root = loader.load();

                // Create a new scene with the loaded parent node
                Scene scene = new Scene(root);

                // Get the current stage
                Stage stage = (Stage) UserName.getScene().getWindow();

                // Set the new scene to the stage
                stage.setScene(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
