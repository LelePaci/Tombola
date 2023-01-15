package com.lelepaci.gui.container;

import com.lelepaci.gui.component.custom.EmptyBox;
import com.lelepaci.gui.core.WindowFrame;

import java.awt.*;

public class Player extends EmptyBox {
    private int y, boxWidth, boxHeight;
    private int position;

    public Player(WindowFrame windowFrame, int position, int y, int boxWidth) {
        super(windowFrame, 2);
        this.y = y;
        this.boxWidth = boxWidth;
        this.boxHeight = 100;
        setPosition(position);
        this.setBounds(0, y, boxWidth, boxHeight);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color);
        switch (position){
            case 0:
                g2d.fillRect(0,boxHeight - arcRadius,getWidth(),arcRadius);
                g2d.setColor(Color.black);
                g2d.drawLine(0,getHeight() - 1, getWidth(), getHeight() - 1);
                break;
            case 1:
                g2d.fillRect(0,0, getWidth(),arcRadius);
                g2d.fillRect(0,boxHeight - arcRadius,getWidth(),arcRadius);
                g2d.setColor(Color.black);
                g2d.drawLine(0,getHeight() - 1, getWidth(), getHeight() - 1);
                break;
            case 2:
                break;
        }

    }

    public int getTotalHeight() {
        return y + getHeight();
    }

    public void setPosition(int position) {
        if (position == 0 || position == 1 || position == 2) {
            this.position = position;
        } else {
            throw new RuntimeException("Invalid position value");
        }
    }

}
