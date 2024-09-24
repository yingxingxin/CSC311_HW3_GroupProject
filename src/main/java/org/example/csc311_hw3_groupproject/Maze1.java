package org.example.csc311_hw3_groupproject;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public class Maze1 extends Maze {

    public Maze1(String mazeImagePath) {
        super(mazeImagePath);
    }

    @Override
    public void drawVehicle(GraphicsContext gc, double x, double y) {
        if (isCarActive) {
            drawCar(gc, x, y);
        } else {
            gc.drawImage(new Image(getClass().getResource("/org/example/csc311_hw3_groupproject/robot.png").toExternalForm()), x, y, 20, 20); // Use robot image
        }
    }

    private void drawCar(GraphicsContext gc, double x, double y) {
        double scaleX = 20.0 / 180.0; // Scale down the car's width
        double scaleY = 20.0 / 40.0;  // Scale down the car's height
        gc.save();
        gc.translate(x, y);
        gc.scale(scaleX, scaleY);
        gc.setFill(Color.PURPLE);
        gc.fillPolygon(new double[]{50, 150, 180, 220, 220, 50},
                new double[]{100, 100, 120, 120, 140, 140}, 6);

        gc.setFill(Color.LAWNGREEN);
        gc.fillRect(60, 110, 30, 20);  // Windows
        gc.fillRect(110, 110, 40, 20);

        gc.setFill(Color.BLACK);
        gc.fillOval(60, 130, 30, 30);  // Wheels
        gc.fillOval(160, 130, 30, 30);

        gc.restore();
    }

    // New method to rotate the vehicle (Car)
    public void rotateVehicle(GraphicsContext gc, double x, double y, double angle) {
        gc.save();
        gc.translate(x + 10, y + 10); // Move pivot point to the center of the car/robot
        gc.rotate(angle);
        gc.translate(-x - 10, -y - 10); // Move pivot point back
        drawVehicle(gc, x, y);  // Redraw the car/robot after rotation
        gc.restore();
    }
}
