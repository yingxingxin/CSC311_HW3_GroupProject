package org.example.csc311_hw3_groupproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MazeGame extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Load the FXML file where the layout (including the TabPane and ImageViews) is defined
        FXMLLoader fxmlLoader = new FXMLLoader(MazeGame.class.getResource("hello-view.fxml"));

        // Create the scene from the FXML
        Scene scene = new Scene(fxmlLoader.load(), 600, 550);

        // Set the stage properties
        stage.setTitle("Maze Game");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
