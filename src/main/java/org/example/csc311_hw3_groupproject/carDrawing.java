package org.example.csc311_hw3_groupproject;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class carDrawing extends Application {
    @Override
    public void start(Stage stage) {
        // Create the canvas
        Canvas canvas = new Canvas(300, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Draw the car
        drawCar(gc);

        // Add canvas to the scene
        Group root = new Group();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root, 300, 300, Color.WHITE);
        stage.setTitle("Car Drawing in JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    private void drawCar(GraphicsContext gc) {
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
    }

    public static void main(String[] args) {
        launch(args);
    }
}
