package com.lelepaci.gui.component;

import com.lelepaci.gui.WindowInfos;
import com.lelepaci.gui.component.base.TPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CloseAppButton extends JButton implements WindowInfos, ActionListener {

    private WindowFrame windowFrame;
    public CloseAppButton(WindowFrame windowFrame) {
        this.windowFrame = windowFrame;
        this.setIcon(new ImageIcon(CLOSING_APP.getImage().getScaledInstance(25, 25,Image.SCALE_SMOOTH)));
        this.setBackground(new Color(0,0,0,0));
        this.setBorder(null);
        this.setContentAreaFilled(false);
        addActionListener(this);
        setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        windowFrame.close();
    }
}
