package com.kiran.controllers;

import com.kiran.Model.ValueSet;
import com.kiran.Model.ValueSet.API_NAME;
import com.kiran.services.CommonService;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    CommonService service;

    @FXML
    public TreeView<String> treeView;

    @FXML
    public Button login;

    @FXML
    public TextArea outputBox;

    @FXML
    public HBox loginPage;

    @FXML
    public HBox welcomePage;

    @FXML
    public Label welcomeLabel;

    @FXML
    public TextField userName;

    @FXML
    public PasswordField password;

    public void unluckUI() {
        loginPage.setVisible(false);
        welcomeLabel.setText("Welcome to the Slate");
        welcomePage.setVisible(true);
        outputBox.setPromptText("");
        outputBox.setFont(new Font(15));
        outputBox.setDisable(false);
        treeView.setDisable(false);
    }

    public void lockUI() {

    }

    public void loginButtonClicked() {
        String user = userName.getText();
        String pass = password.getText();
        if (user.length() !=0 && password.getLength() != 0) {
            if (service.isValidUser(user, pass)) {
                unluckUI();
            } else {
               userName.setStyle("-fx-text-fill: red");
               password.setStyle("-fx-text-fill: red");
            }
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        TreeItem<String> root;
        service = new CommonService();

        ArrayList<TreeItem<String>> baseChild = new ArrayList<>();
        root = new TreeItem<>();
        root.setExpanded(true);
        for (API_NAME apiName : API_NAME.values()) {
            baseChild.add(makeBranch(apiName.name(), root));
            for (ValueSet.API_METHOD apiMethod : apiName.getAllowedMethods()) {
                makeBranch(apiMethod.name(), baseChild.get(apiName.ordinal()));
            }
        }
        treeView.setRoot(root);
        treeView.setShowRoot(false);
        treeView.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
            if (newValue != null) {
                String output = service.getSampleResponse(newValue.getParent().getValue(), newValue.getValue());
                outputBox.setText(output);
            }
        });
    }

    public TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }



}
