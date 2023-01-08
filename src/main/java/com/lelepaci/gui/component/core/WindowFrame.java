package com.lelepaci.gui.component.core;

import com.lelepaci.gui.utils.WindowInfos;

import javax.swing.*;
import java.awt.*;


public class WindowFrame extends JFrame implements WindowInfos {
    public WindowFrame(){
        this.setSize(new Dimension((int) WINDOW_WIDTH,(int) WINDOW_HEIGHT));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(ICON.getImage());
        this.setLocationRelativeTo(null); // Starts at the center of the screen
        this.setUndecorated(true);
        this.setBackground(new Color(0,0,0,0));

        this.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(CURSOR.getImage(),
                new Point(0,0),"custom cursor"));

        // After this must call the method `updateFrame()` cause of Java Swing :/. I don't want to explain, read docs!
        this.setVisible(true);
    }
    public void updateFrame(){
        this.revalidate();
        this.repaint();
    }

    public void close(){
        this.dispose();
        System.exit(0);
    }
}
