package com.kiran.controllers;

import com.kiran.services.CommonService;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    CommonService service = new CommonService();

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
        TreeItem<String> root, productAPI, priceCategoryAPI;
        root = new TreeItem<>();
        root.setExpanded(true);

        productAPI = makeBranch("Product API", root);
        makeBranch("Sample Create", productAPI);
        makeBranch("Sample Read", productAPI);

        priceCategoryAPI = makeBranch("Price Category API", root);
        makeBranch("Sample Create", priceCategoryAPI);
        makeBranch("Sample Read", priceCategoryAPI);

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
