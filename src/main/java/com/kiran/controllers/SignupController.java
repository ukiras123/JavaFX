package com.kiran.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.apache.commons.lang3.StringUtils;

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

    @FXML public Label firstNameError;
    @FXML public Label lastNameError;
    @FXML public Label userNameError;
    @FXML public Label passwordError;


    @FXML
    protected void cancelEvent(ActionEvent event) {
        System.out.println("Cancel");
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }

    @FXML
    protected void signUpEvent(ActionEvent event) {
        System.out.println("Signup");
        String firstName = signUpFirstName.getText();
        String lastName = signUpLastName.getText();
        String userName = signUpUserName.getText();
        String password = signUpPassword.getText();

        if (StringUtils.isEmpty(firstName) || StringUtils.isEmpty(lastName) || StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
            //firstNameError.setValue("All Field Mandatory");
        }
    }
}
