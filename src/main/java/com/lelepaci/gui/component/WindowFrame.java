package com.lelepaci.gui.component;

import com.lelepaci.gui.WindowInfos;

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
    }
}
