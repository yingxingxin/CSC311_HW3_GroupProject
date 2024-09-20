package org.example.csc311_hw3_groupproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class MazeGame extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MazeGame.class.getResource("hello-view.fxml"));
        Image maze = new Image("maze.png");
        Image robot = new Image("robot.png");
        //Comment
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Robot");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}