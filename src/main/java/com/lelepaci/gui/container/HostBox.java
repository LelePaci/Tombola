package com.lelepaci.gui.container;

import com.lelepaci.connection.ConnectionUtils;
import com.lelepaci.gui.control.CopyButton;
import com.lelepaci.gui.control.ReloadButton;
import com.lelepaci.gui.component.custom.EmptyBox;
import com.lelepaci.gui.core.WindowFrame;
import com.lelepaci.gui.utils.FontLoader;
import com.lelepaci.gui.utils.GridBagConstraintsBuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class HostBox extends EmptyBox {
    private JTextField hostField;
    private boolean ipStatus = false;

    public HostBox() {
        super(1);
        this.setLayout(new GridBagLayout());

        addJLabel1();
        addHostLabel();
        addCopyButton();

        this.setPreferredSize(new Dimension(getLargestChildPreferredWidth() + 120, getPreferredSize().height));
        windowFrame.updateFrame();
    }

    private void addJLabel1(){
        JLabel jLabel1 = new JLabel("Condividi questo indirizzo IP ai tuoi amici");
        jLabel1.setFont(FontLoader.loadFont(UNIVERSES_FONT_PATH, 15));
        jLabel1.setForeground(Color.GRAY);

        GridBagConstraints gridLabel1 = GridBagConstraintsBuilder.build(0, 0, .0f, .1f, 2,1, new Insets(10, 0, 0, 0));

        this.add(jLabel1, gridLabel1);
    }

    private void addHostLabel(){
        hostField = new JTextField();
        hostField.setEditable(false);
        hostField.setBackground(new Color(0,0,0,0));
        hostField.setBorder(BorderFactory.createEmptyBorder());

        GridBagConstraints gridHostLabel = GridBagConstraintsBuilder.build(0,1,.0f,.0f, new Insets(0,0,0,0));
        setIPText();
        this.add(hostField, gridHostLabel);
    }

    private void addCopyButton(){
        GridBagConstraints gridCopyReloadButton = GridBagConstraintsBuilder.build(1, 1, .0f, .0f, new Insets(0, 5, 0, 0));
        if (ipStatus) {
            CopyButton copyButton = new CopyButton(hostField);
            this.add(copyButton, gridCopyReloadButton);
        } else {
            ReloadButton reloadButton = new ReloadButton();
            reloadButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setIPText();
                }
            });
            this.add(reloadButton, gridCopyReloadButton);
        }
    }

    private void setIPText(){
        hostField.setText("");
        try {
            hostField.setText(ConnectionUtils.getCurrentPublicIP());
            hostField.setFont(FontLoader.loadFont(BEBAS_NEUE_FONT_PATH, 50));
            hostField.setForeground(Color.BLACK);
            ipStatus = true;
        } catch (IOException e) {
            new RuntimeException("Cannot retrieve current ip address");
        }
        windowFrame.updateFrame();
    }
}
