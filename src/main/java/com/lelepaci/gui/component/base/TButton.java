package com.lelepaci.gui.component.base;

import com.lelepaci.gui.WindowInfos;
import com.lelepaci.gui.component.WindowFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class TButton extends JButton implements WindowInfos, ActionListener {
    protected WindowFrame windowFrame;

    public TButton(WindowFrame windowFrame) {
        this.windowFrame = windowFrame;
        this.setOpaque(false);
        this.setBackground(new Color(0,0,0,0));
        this.setContentAreaFilled(false);
        this.setBorder(null);
        this.setLayout(null);
    }
}
