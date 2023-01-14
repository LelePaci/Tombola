package com.lelepaci.gui.component.button;

import com.lelepaci.gui.component.base.TButton;
import com.lelepaci.gui.component.core.WindowFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReloadButton extends TButton {
    public ReloadButton(WindowFrame windowFrame) {
        super(windowFrame);
        Image icon = new ImageIcon(ICONS_FOLDER + "reload.png").getImage();
        this.setIcon(new ImageIcon(icon.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
    }
}
