package com.lelepaci.gui.windows;

import com.lelepaci.gui.component.Window;

import java.awt.*;

public class StartWindow extends Window {
    public StartWindow(String windowName) {
        super(windowName);
        this.setOpaque(false);
        this.setSize(new Dimension(200, 300));
    }

    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(new Color(25,225,225));
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
        System.out.println("paint");
        super.paintComponent(g);
    }
}
