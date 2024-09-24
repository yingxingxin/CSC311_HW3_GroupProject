package org.example.csc311_hw3_groupproject;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;

public class MazeController {

    @FXML
    private Canvas maze1Canvas;  // First canvas for Maze 1

    @FXML
    private Canvas maze2Canvas;  // Second canvas for Maze 2

    private GraphicsContext gc1;
    private GraphicsContext gc2;

    private Maze1 maze1;
    private Maze2 maze2;

    private final int MOVE_INCREMENT = 10;
    private boolean isMaze1Active = true;

    private double vehicleX = 50;
    private double vehicleY = 100;
    private double currentAngle = 0; // Keep track of current rotation angle

    public void initialize() {
        // Initialize both canvases
        gc1 = maze1Canvas.getGraphicsContext2D();
        gc2 = maze2Canvas.getGraphicsContext2D();

        maze1 = new Maze1("/org/example/csc311_hw3_groupproject/maze.png");
        maze2 = new Maze2("/org/example/csc311_hw3_groupproject/maze2.png");

        drawMaze();
        drawVehicle();
    }

    private void drawMaze() {
        if (isMaze1Active) {
            gc1.drawImage(maze1.getImage(), 0, 0);  // Draw on Maze 1 canvas
        } else {
            gc2.drawImage(maze2.getImage(), 0, 0);  // Draw on Maze 2 canvas
        }
    }

    private void drawVehicle() {
        if (isMaze1Active) {
            gc1.clearRect(0, 0, maze1Canvas.getWidth(), maze1Canvas.getHeight());
            drawMaze();
            maze1.rotateVehicle(gc1, vehicleX, vehicleY, currentAngle);  // Draw vehicle with rotation
        } else {
            gc2.clearRect(0, 0, maze2Canvas.getWidth(), maze2Canvas.getHeight());
            drawMaze();
            maze2.rotateVehicle(gc2, vehicleX, vehicleY, currentAngle);  // Draw vehicle with rotation
        }
    }

    @FXML
    public void handleKeyPress(KeyEvent event) {
        switch (event.getCode()) {
            case UP:
                if (isMaze1Active && maze1.isValidMove((int) vehicleX, (int) (vehicleY - MOVE_INCREMENT))) {
                    vehicleY -= MOVE_INCREMENT;
                    currentAngle = -90;  // Rotate to face upwards
                } else if (!isMaze1Active && maze2.isValidMove((int) vehicleX, (int) (vehicleY - MOVE_INCREMENT))) {
                    vehicleY -= MOVE_INCREMENT;
                    currentAngle = -90;
                }
                break;
            case DOWN:
                if (isMaze1Active && maze1.isValidMove((int) vehicleX, (int) (vehicleY + MOVE_INCREMENT))) {
                    vehicleY += MOVE_INCREMENT;
                    currentAngle = 90;  // Rotate to face downwards
                } else if (!isMaze1Active && maze2.isValidMove((int) vehicleX, (int) (vehicleY + MOVE_INCREMENT))) {
                    vehicleY += MOVE_INCREMENT;
                    currentAngle = 90;
                }
                break;
            case LEFT:
                if (isMaze1Active && maze1.isValidMove((int) (vehicleX - MOVE_INCREMENT), (int) vehicleY)) {
                    vehicleX -= MOVE_INCREMENT;
                    currentAngle = 180;  // Rotate to face left
                } else if (!isMaze1Active && maze2.isValidMove((int) (vehicleX - MOVE_INCREMENT), (int) vehicleY)) {
                    vehicleX -= MOVE_INCREMENT;
                    currentAngle = 180;
                }
                break;
            case RIGHT:
                if (isMaze1Active && maze1.isValidMove((int) (vehicleX + MOVE_INCREMENT), (int) vehicleY)) {
                    vehicleX += MOVE_INCREMENT;
                    currentAngle = 0;  // Rotate to face right
                } else if (!isMaze1Active && maze2.isValidMove((int) (vehicleX + MOVE_INCREMENT), (int) vehicleY)) {
                    vehicleX += MOVE_INCREMENT;
                    currentAngle = 0;
                }
                break;
            default:
                break;
        }

        // Redraw vehicle after movement
        drawVehicle();
    }

    @FXML
    public void switchMaze() {
        isMaze1Active = !isMaze1Active;
        drawVehicle();
    }

    @FXML
    public void toggleVehicle() {
        if (isMaze1Active) {
            maze1.toggleVehicle();
        } else {
            maze2.toggleVehicle();
        }
        drawVehicle();
    }
}
