package com.lelepaci.gui.component.base;

import com.lelepaci.gui.component.core.WindowFrame;
import com.lelepaci.gui.utils.WindowInfos;
import com.lelepaci.gui.utils.FontLoader;

import javax.swing.*;
import java.awt.*;

public class TTextField extends JTextField implements WindowInfos {

    private WindowFrame windowFrame;
    private String placeholder;

    public TTextField(String placeholder, int size) {
        super(placeholder);
        this.placeholder = placeholder;
        setFont(FontLoader.loadFont(UNIVERSES_FONT_PATH, size));
        setBackground(new Color(0,0,0,0));
        setForeground(Color.GRAY);
        setBorder(BorderFactory.createEmptyBorder(5,15,5,15));
    }

    public TTextField(WindowFrame windowFrame, String placeholder, int size) {
        super(placeholder);
        this.windowFrame = windowFrame;
        this.placeholder = placeholder;
        setFont(FontLoader.loadFont(UNIVERSES_FONT_PATH, size));
        setBackground(new Color(0,0,0,0));
        setForeground(Color.GRAY);
        setBorder(BorderFactory.createEmptyBorder(5,15,5,15));
    }

    public void hidePlaceholder() {
        if (getText().equals(placeholder)) {
            setText("");
            setForeground(Color.BLACK);
        }
    }

    public void showPlaceholder() {
        if (getText().equals("")) {
            setForeground(Color.GRAY);
            setText(placeholder);
        }
    }

    public String getPlaceholder(){
        return placeholder;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.decode("#d9d9d9"));
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
//        Graphics2D g2d = (Graphics2D) g;
//        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        g2d.setColor(Color.decode("#d9d9d9"));
//        g2d.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 30, 30);
//        super.paintBorder(g);
    }

    @Override
    public void setVisible(boolean aFlag) {
        super.setVisible(aFlag);
        if (windowFrame != null){
            windowFrame.updateFrame();
        }
    }
}
