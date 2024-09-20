package org.example.csc311_hw3_groupproject;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MazeController {
    @FXML
    private ImageView mazeView;  // Refers to the first maze image in FXML

    @FXML
    private ImageView robotView;  // Refers to the robot image in FXML

    @FXML
    private ImageView mazeView2;  // Refers to the second maze image in FXML

    public void initialize() {
        // Initialize the images for the first maze and robot
        mazeView.setImage(new Image("maze.png"));
        robotView.setImage(new Image("robot.png"));
        robotView.setX(10);  // Set initial robot position on the first maze
        robotView.setY(500);

        // Initialize the image for the second maze
        mazeView2.setImage(new Image("maze2.png"));
    }
}
