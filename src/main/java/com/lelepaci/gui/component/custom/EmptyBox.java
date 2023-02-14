package com.lelepaci.gui.component.custom;

import com.lelepaci.gui.component.base.TPanel;
import com.lelepaci.gui.core.WindowFrame;
import com.lelepaci.gui.utils.IGui;
import com.lelepaci.gui.utils.WindowInfos;

import java.awt.*;

public class EmptyBox extends TPanel implements WindowInfos, IGui {
    private int style;
    protected int arcRadius;
    protected Color color;

    public EmptyBox(int style) {
        this.setOpaque(false);
        this.style = style;
        this.arcRadius = 50;
    }

    public EmptyBox(int style, int arcRadius) {
        this.setOpaque(false);
        this.style = style;
        this.arcRadius = arcRadius;
    }

    @Override
    protected void paintComponent(Graphics g) {
        //#e9e9e9
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        switch (style){
            case 1:
                color = Color.decode("#e9e9e9");
                break;
            case 2:
                color = Color.decode("#d9d9d9");
                break;
            default:
                color = Color.WHITE;
                break;
        }
        g2d.setColor(color);
        g2d.fillRoundRect(0,0, getWidth(), getHeight(), arcRadius, arcRadius);
        super.paintComponent(g);
    }
}
