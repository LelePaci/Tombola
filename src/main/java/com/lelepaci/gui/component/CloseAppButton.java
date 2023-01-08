package com.lelepaci.gui.component;

import com.lelepaci.gui.WindowInfos;
import com.lelepaci.gui.component.base.TButton;
import com.lelepaci.gui.component.base.TPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class CloseAppButton extends TButton {
    public CloseAppButton(WindowFrame windowFrame) {
        super(windowFrame);
        this.setIcon(new ImageIcon(CLOSING_APP.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        windowFrame.close();
    }
}
