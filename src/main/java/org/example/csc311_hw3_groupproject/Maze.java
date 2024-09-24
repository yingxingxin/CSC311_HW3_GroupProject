package org.example.csc311_hw3_groupproject;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.PixelReader;
import javafx.scene.paint.Color;

public abstract class Maze {

    protected Image mazeImage;
    protected PixelReader mazePixelReader;
    protected boolean isCarActive;

    public Maze(String mazeImagePath) {
        this.mazeImage = new Image(getClass().getResource(mazeImagePath).toExternalForm());
        this.mazePixelReader = mazeImage.getPixelReader();
    }

    public void toggleVehicle() {
        isCarActive = !isCarActive;
    }

    public boolean isValidMove(int x, int y) {
        if (x < 0 || y < 0 || x >= mazeImage.getWidth() || y >= mazeImage.getHeight()) {
            return false;
        }
        Color color = mazePixelReader.getColor(x, y);
        return !isWall(color);
    }

    private boolean isWall(Color color) {
        return color.equals(Color.BLUE); // Assume walls are blue
    }

    public abstract void drawVehicle(GraphicsContext gc, double x, double y);

    public Image getImage() {
        return mazeImage;
    }
}
