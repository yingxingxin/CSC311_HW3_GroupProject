package org.example.csc311_hw3_groupproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Frame extends JFrame implements KeyListener {

    JLabel label;

    @Override
    public void keyTyped(KeyEvent e) {
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

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
