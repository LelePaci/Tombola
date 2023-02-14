package com.lelepaci.gui.control;

import com.lelepaci.gui.component.base.TButton;
import com.lelepaci.gui.core.WindowFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CopyButton extends TButton implements ActionListener {
    private String toCopy = null;
    private JTextField textField;
    public CopyButton(JTextField textField) {
        Image icon = new ImageIcon(ICONS_FOLDER + "copy.png").getImage();
        this.setIcon(new ImageIcon(icon.getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        this.textField = textField;

        this.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        StringSelection selection = new StringSelection(textField.getText());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, null);
    }
}
