package com.lelepaci.gui.component.button;

import com.lelepaci.gui.component.base.TButton;
import com.lelepaci.gui.component.core.WindowFrame;

import javax.swing.*;
import java.awt.*;

public class GoNextButton extends TButton {
    public GoNextButton(WindowFrame windowFrame) {
        super(windowFrame);
        this.setIcon(new ImageIcon(RIGHT_ARROW.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setPaint(RADIAL_GRADIENT_PAINT);
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 30,30);
        super.paintComponent(g);
    }
}
