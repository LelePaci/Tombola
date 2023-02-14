package com.lelepaci.gui.core;

import com.lelepaci.gui.utils.WindowInfos;

import javax.swing.*;
import java.awt.*;


public class WindowFrame extends JFrame implements WindowInfos {
    private static WindowFrame istance = null;

    public static synchronized WindowFrame getInstance() {
        if (istance == null) {
            istance = new WindowFrame();
        }
        return istance;
    }

    private TCursor tCursor;

    private WindowFrame() {
        this.setSize(new Dimension((int) WINDOW_WIDTH, (int) WINDOW_HEIGHT));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(ICON.getImage());
        this.setLocationRelativeTo(null); // Starts at the center of the screen
        this.setUndecorated(true);
        this.setBackground(new Color(0, 0, 0, 0));

        tCursor = new TCursor("frecciaScrausa.png", null, null);
        setStandardCursor();

        // After this must call the method `updateFrame()` cause of Java Swing :/. I don't want to explain, read docs!
        this.setVisible(true);
    }

    public void updateFrame() {
        this.revalidate();
        this.repaint();
    }

    public void close() {
        this.dispose();
        System.exit(0);
    }

    public void setStandardCursor() {
        setCursor(tCursor.getStandard());
    }

    public void setPointerCursor() {
        setCursor(tCursor.getPointer());
    }

    public void setTextCursor() {
        setCursor(tCursor.getText());
    }
}
