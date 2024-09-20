package org.example.csc311_hw3_groupproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class MazeGame extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MazeGame.class.getResource("hello-view.fxml"));
         Maze maze = new Maze("maze.png");
         ImageView mazeView = maze.getView();

        Image robot = new Image("robot.png");
        ImageView robotView = new ImageView(robot);
        robotView.setFitWidth(20);  // Set robot size
        robotView.setFitHeight(20);
        robotView.setX(50);  // Initial position for the robot
        robotView.setY(50);

        //Comment
        Scene scene = new Scene(fxmlLoader.load(), 600, 550);
        stage.setTitle("Robot");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}