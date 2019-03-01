package com.oracle.myApp;

import com.oracle.myApp.View.View;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("laba 1");

        primaryStage.setScene(new Scene(new View(), 300, 100));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
