package com.kiran.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * Created by Kiran on 5/29/17.
 */
public class SignupConfirmationController extends BaseController {
    @FXML
    public Label userConfirmed;

    @FXML
    private void initialize() {
        userConfirmed.setText(getUserName());
    }

    @FXML
    protected void closeWindow(ActionEvent event) {
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();

    }
}
