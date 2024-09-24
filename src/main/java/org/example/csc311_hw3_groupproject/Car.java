package org.example.csc311_hw3_groupproject;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Car {
    private double x;
    private double y;
    private double width;
    private double height;
    private GraphicsContext gc;

    public Car(double x, double y, GraphicsContext gc) {
        this.x = x;
        this.y = y;
        this.width = 100 * 0.25;
        this.height = 40 * 0.25;
        this.gc = gc;
    }

    public void draw() {
        gc.setFill(Color.PURPLE);
        gc.fillPolygon(new double[]{x + 50, x + 150, x + 180, x + 220, x + 220, x + 50},
                new double[]{y + 100, y + 100, y + 120, y + 120, y + 140, y + 140}, 6);

        gc.setFill(Color.LAWNGREEN);
        gc.fillRect(x + 60, y + 110, 30, 20);  // Windows
        gc.fillRect(x + 110, y + 110, 40, 20);

        gc.setFill(Color.BLACK);
        gc.fillOval(x + 60, y + 130, 30, 30);  // Wheels
        gc.fillOval(x + 160, y + 130, 30, 30);
    }

    public void move(double dx, double dy) {
        x += dx;
        y += dy;
        draw();
    }
}
