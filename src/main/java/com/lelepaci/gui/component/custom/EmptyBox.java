package com.lelepaci.gui.component.custom;

import com.lelepaci.gui.component.base.TPanel;
import com.lelepaci.gui.core.WindowFrame;
import com.lelepaci.gui.utils.IGui;
import com.lelepaci.gui.utils.WindowInfos;

import java.awt.*;

public class EmptyBox extends TPanel implements WindowInfos, IGui {

    public EmptyBox(WindowFrame windowFrame) {
        super(windowFrame);
        this.setOpaque(false);
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
