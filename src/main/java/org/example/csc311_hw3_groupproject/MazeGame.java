package org.example.csc311_hw3_groupproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TabPane;

import java.io.IOException;

public class MazeGame extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/csc311_hw3_groupproject/hello-view.fxml"));


        // Load the FXML file, the root is a TabPane
        TabPane root = fxmlLoader.load();

        Scene scene = new Scene(root, 600, 550);

        // Request focus on the scene to capture key events
        root.requestFocus();

        stage.setTitle("Maze Game");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
