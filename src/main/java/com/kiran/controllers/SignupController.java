package com.kiran.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Created by Kiran on 5/29/17.
 */
public class SignupController {

    @FXML public TextField signUpFirstName;
    @FXML public TextField signUpLastName;
    @FXML public TextField signUpUserName;
    @FXML public PasswordField signUpPassword;
    @FXML public Button signUpButton;
    @FXML public Button signUpCancel;

    @FXML
    protected void cancelEvent(ActionEvent event) {
        System.out.println("Cancel");
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }
}
