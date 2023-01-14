package com.lelepaci.gui.component.button;

import com.lelepaci.gui.component.base.TButton;
import com.lelepaci.gui.component.core.WindowFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CloseAppButton extends TButton implements ActionListener {

    public CloseAppButton(WindowFrame windowFrame) {
        super(windowFrame);
        Image icon = new ImageIcon(ICONS_FOLDER + "app-closing.png").getImage();
        this.setIcon(new ImageIcon(icon.getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        windowFrame.close();
    }
}
