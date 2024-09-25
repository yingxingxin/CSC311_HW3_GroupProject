package org.example.csc311_hw3_groupproject;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

import java.awt.event.KeyListener;

public class MazeController {
    @FXML
    private ImageView mazeView;  // Refers to the first maze image in FXML

    @FXML
    private ImageView robotView;  // Refers to the robot image in FXML

    @FXML
    private ImageView mazeView2;  // Refers to the second maze image in FXML

    @FXML
    private Tab Maze1;

    @FXML
    private Tab Maze2;

    private Frame frame;

    private GraphicsContext car;

    public void initialize() {
        System.out.println("The Maze Controller has been intialized");
        // Initialize the images for the first maze and robot
        mazeView.setImage(new Image("maze.png"));
        robotView.setImage(new Image("robot.png"));
        robotView.setLayoutX(-2);  // Set initial robot position on the first maze
        robotView.setLayoutY(259);

        // Initialize the image for the second maze
        mazeView2.setImage(new Image("maze2.png"));
        //Maze1.setDisable(true);
        //Maze2.setDisable(true);
        car = drawCar(new Canvas(300, 300).getGraphicsContext2D());

    }

    private GraphicsContext drawCar(GraphicsContext gc) {
        // Set car body color to purple
        gc.setFill(Color.PURPLE);

        // Draw the car body (polygon shape)
        gc.fillPolygon(new double[]{50, 150, 180, 220, 220, 50},
                new double[]{100, 100, 120, 120, 140, 140}, 6);

        // Set windows color to green
        gc.setFill(Color.LAWNGREEN);
        gc.fillRect(60, 110, 30, 20);  // First window
        gc.fillRect(110, 110, 40, 20); // Second window

        // Set wheels color to black
        gc.setFill(Color.BLACK);
        gc.fillOval(60, 130, 30, 30);  // Rear wheel
        gc.fillOval(160, 130, 30, 30); // Front wheel
        return gc;
    }

}
