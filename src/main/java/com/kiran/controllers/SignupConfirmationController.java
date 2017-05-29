package com.kiran.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

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

}
