package com.kiran.controllers;

import com.kiran.Model.Entity.User;
import com.kiran.Model.ValueSet.USER_ERROR;
import com.kiran.services.DatabaseService;
import com.kiran.services.UserAuthenticationService;
import com.kiran.services.Util;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.Set;

/**
 * Created by Kiran on 5/29/17.
 */
public class SignupController extends BaseController{

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
        clearErrorMessage();
        UserAuthenticationService service = new UserAuthenticationService();

        if (StringUtils.isEmpty(firstName) || StringUtils.isEmpty(lastName) || StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
            firstNameError.setStyle("-fx-text-fill: red");
            firstNameError.setText("All Fields are Mandatory*");
        } else {
            if (service.isValidSignupInput(firstName, lastName, userName, password)) {
                User newUser = new User(Util.convertToFirstCapital(firstName), Util.convertToFirstCapital(lastName), userName, password);
                new DatabaseService().createUser(newUser);
                ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
                setUserName(userName);
                setFirstName(firstName);
                setLastName(lastName);
                changeSceneToConfirmation();
            } else {
                Set<USER_ERROR> errors =  UserAuthenticationService.getErrors();
                for (USER_ERROR error :errors) {
                    switch (error) {
                        case FIRST_NAME:
                            showError(firstNameError,error.getErrorMessage());
                            break;
                        case LAST_NAME:
                            showError(lastNameError,error.getErrorMessage());
                            break;
                        case USER_NAME:
                            showError(userNameError,error.getErrorMessage());
                            break;
                        case PASSWORD:
                            showError(passwordError,error.getErrorMessage());
                            break;
                    }
                }
            }
        }
    }


    private void changeSceneToConfirmation() {
        System.out.println("sign up am clicked");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/signupConfirmation.fxml"));
        Parent root1 = null;
        try {
            root1 = (Parent) fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("Sign Up Confirmation");
        stage.setScene(new Scene(root1));
        stage.show();
    }
    private void clearErrorMessage() {
        firstNameError.setText("");
        firstNameError.getStyleClass().clear();
        lastNameError.setText("");
        lastNameError.getStyleClass().clear();
        userNameError.setText("");
        userNameError.getStyleClass().clear();
        passwordError.setText("");
        passwordError.getStyleClass().clear();
    }

    private void showError(Label label, String errorMessage) {
        label.setStyle("-fx-text-fill: red");
        label.setText(errorMessage);
    }



}
