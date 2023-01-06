package com.lelepaci.gui.component;

import javax.swing.*;
import java.awt.*;

public class WindowPanel extends JPanel {
    public WindowPanel() {
        this.setOpaque(false);
        this.setLayout(null);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(new Color(255,0,0));
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
        super.paintComponent(g);
    }
}