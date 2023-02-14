package com.lelepaci.gui.component.base;

import com.lelepaci.gui.utils.WindowInfos;
import com.lelepaci.gui.core.WindowFrame;

import javax.swing.*;
import java.awt.*;

public abstract class TButton extends JButton implements WindowInfos {
    protected WindowFrame windowFrame = WindowFrame.getInstance();

    public TButton() {
        this.setOpaque(false);
        this.setBackground(new Color(0,0,0,0));
        this.setContentAreaFilled(false);
        this.setBorder(null);
        this.setLayout(null);
        this.setFocusPainted(false);
        this.setBorderPainted(false);
    }

    @Override
    public void setVisible(boolean aFlag) {
        super.setVisible(aFlag);
        windowFrame.updateFrame();
    }
}
