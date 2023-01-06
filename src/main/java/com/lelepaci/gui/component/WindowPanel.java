package com.lelepaci.gui.component;

import com.lelepaci.gui.WindowInfos;

import javax.swing.*;
import java.awt.*;

public class WindowPanel extends JPanel implements WindowInfos {
    public WindowPanel() {
        this.setOpaque(false);
        this.setLayout(new BorderLayout());
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setPaint(RADIAL_GRADIENT_PAINT);
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
        super.paintComponent(g);
        System.out.println("Painted: WindowPanel");
    }
}