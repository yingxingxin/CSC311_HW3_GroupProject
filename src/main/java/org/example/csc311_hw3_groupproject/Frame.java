package org.example.csc311_hw3_groupproject;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javafx.scene.image.ImageView;

public class Frame extends JFrame implements KeyListener {

    JLabel label;

    public Frame(String img){
        label = new JLabel("robot.png");
    }

    public void initialize(){
        System.out.println("The Frame has been instantiated");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("We are attempting to move");
        switch(e.getKeyChar()) {
            //left arrow
            case 37:
                label.setLocation(label.getX()-10, label.getY());
                break;
            //up arrow
            case 38:
                label.setLocation(label.getX(), label.getY()-10);
                break;
            //right arrow
            case 39:
                label.setLocation(label.getX(), label.getY()+10);
                break;
            //down arrow
            case 40:
                label.setLocation(label.getX()+10, label.getY());
                break;

        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("We have pressed any key.");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("We have released any key.");
    }

    public void keyTyped(javafx.scene.input.KeyEvent e) {
        System.out.println("We are attempting to move");
        System.out.println(e.getCode());

        }
    }
