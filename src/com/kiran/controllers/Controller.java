package com.kiran.controllers;

import com.kiran.Model.ValueSet;
import com.kiran.services.CommonService;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

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

    public void loginButtonClicked() {
        System.out.println("Clicked");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        TreeItem<String> root;
        service = new CommonService();

        ArrayList<TreeItem<String>> baseChild = new ArrayList<>();
        root = new TreeItem<>();
        root.setExpanded(true);
        for (ValueSet.API_NAME apiName : ValueSet.API_NAME.values()) {
            baseChild.add(makeBranch(apiName.name(), root));
            for (ValueSet.API_METHOD apiMethod : apiName.getAllowedMethods()) {
                makeBranch(apiMethod.name(), baseChild.get(apiName.ordinal()));
            }
        }

        treeView.setRoot(root);
        treeView.setShowRoot(false);
        treeView.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
            if (newValue != null) {
                //String output = service.getSampleResponse(newValue.getParent().getValue(), newValue.getValue());
                outputBox.setText("hi");
            }
        });
    }

    public TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }


//    public void listeners() {
//
//    }


}
