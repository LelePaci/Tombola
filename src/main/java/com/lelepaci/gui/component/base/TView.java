package com.lelepaci.gui.component.base;

import com.lelepaci.gui.core.WindowFrame;

import java.awt.*;

public class TView extends TPanel{
    public TView(WindowFrame windowFrame) {
        super(windowFrame);
        this.setOpaque(false);
        this.setPreferredSize(new Dimension((int)WINDOW_WIDTH, (int) WINDOW_HEIGHT - 25));
        this.setBounds(0, 25, (int) WINDOW_WIDTH, (int) WINDOW_HEIGHT - 25);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        super.paintComponent(g);
    }
}
