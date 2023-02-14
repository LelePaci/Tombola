package com.lelepaci.gui.control;

import com.lelepaci.gui.component.base.TButton;
import com.lelepaci.gui.core.WindowFrame;

import javax.swing.*;
import java.awt.*;

public class ReloadButton extends TButton {
    public ReloadButton() {
        Image icon = new ImageIcon(ICONS_FOLDER + "reload.png").getImage();
        this.setIcon(new ImageIcon(icon.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
    }
}
