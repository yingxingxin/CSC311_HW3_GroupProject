package org.example.csc311_hw3_groupproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MazeController {
    @FXML
    private ImageView mazeView;  // Refers to the maze image in FXML

    @FXML
    private ImageView robotView;  // Refers to the robot image in FXML

    public void initialize() {
        // Initialize your maze and robot positions if necessary
        mazeView.setImage(new Image("maze.png"));
        robotView.setImage(new Image("robot.png"));
        robotView.setX(50);  // Initial robot position
        robotView.setY(50);
    }



}