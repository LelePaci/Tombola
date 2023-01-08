package com.lelepaci.gui.component.base;

import com.lelepaci.gui.component.core.WindowFrame;

import java.awt.*;

public class InputBox extends TPanel {

    public InputBox(WindowFrame windowFrame) {
        super(windowFrame);
        this.setOpaque(false);
        System.out.println(getPreferredSize());
    }

    @Override
    protected void paintComponent(Graphics g) {
        //#e9e9e9
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.decode("#e9e9e9"));
        g2d.fillRoundRect(0,0, getWidth(), getHeight(), 50, 50);
        super.paintComponent(g);
    }
}
