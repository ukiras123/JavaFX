package com.kiran;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    private Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        Parent root = (Parent) loader.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("view/main.fxml"));
        this.stage = primaryStage;
        primaryStage.setTitle("SLATE");
        primaryStage.setScene(new Scene(root, 800, 700));
        primaryStage.show();
    }

    public Stage getStage() {
        return stage;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
