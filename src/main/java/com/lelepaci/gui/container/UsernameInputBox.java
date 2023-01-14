package com.lelepaci.gui.container;

import com.lelepaci.gui.component.custom.EmptyBox;
import com.lelepaci.gui.component.base.TTextField;
import com.lelepaci.gui.component.custom.RedButton;
import com.lelepaci.gui.core.WindowFrame;
import com.lelepaci.gui.utils.GridBagConstraintsBuilder;
import com.lelepaci.gui.utils.ViewManager;
import com.lelepaci.main.Tombola;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UsernameInputBox extends EmptyBox {
    private TTextField usernameField;
    private TTextField ipAddressField;


    private int internalBorder = 15;
    private int usernameFieldWidth = 400 + internalBorder;
    private int componentsHeight = 50;

    int boxWidth = usernameFieldWidth + 2 * internalBorder;
    int boxHeight = 3*internalBorder;

    public UsernameInputBox(WindowFrame windowFrame) {
        super(windowFrame);
        this.setLayout(new GridBagLayout());

        //COMPONENTS
        usernameField = new TTextField("Inserisci username", 18);
        usernameField.setPreferredSize(new Dimension(usernameFieldWidth, componentsHeight));
        usernameField.setMinimumSize(new Dimension(usernameFieldWidth, componentsHeight));
        usernameField.setHorizontalAlignment(JTextField.CENTER);
        boxHeight += componentsHeight;

        Dimension buttonsDim = new Dimension(200, componentsHeight);
        RedButton createLobbyButton = new RedButton(windowFrame, "Crea Lobby", buttonsDim);
        RedButton joinLobbyButton = new RedButton(windowFrame, "Partecipa", buttonsDim);
        boxHeight += componentsHeight;

        //LAYOUTS
        GridBagConstraints gridUsernameField = GridBagConstraintsBuilder.build(0, 0, .0f, .0f, 2, 1, new Insets(0, 0, internalBorder, 0));
        GridBagConstraints gridCreateLobbyButton = GridBagConstraintsBuilder.build(0, 1, .0f, .0f, new Insets(0, 0, 0, internalBorder / 2));
        GridBagConstraints gridJoinLobbyButton = GridBagConstraintsBuilder.build(1, 1, .0f, .0f, new Insets(0, internalBorder / 2, 0, 0));

        createLobbyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadLobby(true);
            }
        });

        joinLobbyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkUsername()) {
                    joinLobbyButton.setEnabled(false);
                    showIpAddressText();
                }
            }
        });

//        showIpAddressText();
        this.setPreferredSize(new Dimension(boxWidth, boxHeight));

        this.add(usernameField, gridUsernameField);
        this.add(createLobbyButton, gridCreateLobbyButton);
        this.add(joinLobbyButton, gridJoinLobbyButton);
    }

    private void loadLobby(boolean server) {
        Tombola.username = usernameField.getText();
        ViewManager.startView.setVisible(false);
        ViewManager.lobbyView.setVisible(true);
    }


    public boolean checkUsername() {
        if (!usernameField.getText().equals(usernameField.getPlaceholder())) {
            if (usernameField.getText().length() > 4) {
                return true;
            }
        }
        return false;
    }

    public void showIpAddressText() {
        ipAddressField = new TTextField("Inserisci indirizzo IP host", 18);
        ipAddressField.setPreferredSize(new Dimension(usernameFieldWidth, componentsHeight));
        ipAddressField.setMinimumSize(new Dimension(usernameFieldWidth, componentsHeight));
        ipAddressField.setHorizontalAlignment(JTextField.CENTER);
        boxHeight += componentsHeight + internalBorder;

        GridBagConstraints gridIpAddressField = GridBagConstraintsBuilder.build(0, 2, .0f, .0f, 2,1, new Insets(internalBorder, 0, 0, 0));
        GridBagConstraints gridGoNextButton = GridBagConstraintsBuilder.build(0, 3, .0f, .0f, 2,1, new Insets(internalBorder, 0, 0, 0));

        RedButton goNextButton = new RedButton(windowFrame, "Continua", new Dimension(usernameFieldWidth, componentsHeight));
        boxHeight += componentsHeight + internalBorder;

        this.setPreferredSize(new Dimension(boxWidth, boxHeight));
        this.add(ipAddressField, gridIpAddressField);
        this.add(goNextButton, gridGoNextButton);
        windowFrame.updateFrame();
    }
}
