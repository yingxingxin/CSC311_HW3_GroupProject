package org.example.csc311_hw3_groupproject;

import javafx.scene.image.PixelReader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class Maze {
    private Image mazeImage;
    private ImageView mazeView;
    private PixelReader mazePixelReader;

    // Constructor to load the maze image
    public Maze(String mazeImagePath) {
        // Load the image and create an ImageView to display it
        this.mazeImage = new Image(mazeImagePath);
        this.mazeView = new ImageView(mazeImage);
        mazeView.setPreserveRatio(true);
        mazeView.setFitWidth(600);

        // Get the pixel reader to read individual pixels in the maze image
        mazePixelReader = mazeImage.getPixelReader();
    }

    // Method to check if a given position (x, y) is a valid move
    //public boolean isValidMove(int x, int y) {

   // }

    // Getter method to access the ImageView for displaying the maze
    public ImageView getView() {
        return mazeView;  // Return the ImageView
    }
}
