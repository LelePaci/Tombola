package com.lelepaci.gui.component;

import com.lelepaci.gui.component.base.EmptyBox;
import com.lelepaci.gui.component.base.TTextField;
import com.lelepaci.gui.component.button.CreateOrJoinLobbyButton;
import com.lelepaci.gui.component.button.GoNextButton;
import com.lelepaci.gui.component.core.WindowFrame;
import com.lelepaci.gui.utils.GridBagConstraintBuilder;
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
    int boxHeight = internalBorder;

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
        CreateOrJoinLobbyButton createLobbyButton = new CreateOrJoinLobbyButton(windowFrame, "Crea Lobby", buttonsDim);
        CreateOrJoinLobbyButton joinLobbyButton = new CreateOrJoinLobbyButton(windowFrame, "Partecipa", buttonsDim);
        boxHeight += 2 * componentsHeight;

        //LAYOUTS
        GridBagConstraints gridUsernameField = GridBagConstraintBuilder.build(0, 0, .0f, .0f, 2, 1, new Insets(0, 0, internalBorder, 0));
        GridBagConstraints gridCreateLobbyButton = GridBagConstraintBuilder.build(0, 1, .0f, .0f, new Insets(0, 0, 0, internalBorder / 2));
        GridBagConstraints gridJoinLobbyButton = GridBagConstraintBuilder.build(1, 1, .0f, .0f, new Insets(0, internalBorder / 2, 0, 0));

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

        showIpAddressText();
        this.setPreferredSize(new Dimension(boxWidth, boxHeight));

        this.add(usernameField, gridUsernameField);
        this.add(createLobbyButton, gridCreateLobbyButton);
        this.add(joinLobbyButton, gridJoinLobbyButton);
    }

    public void loadLobby(boolean server) {
        Tombola.username = usernameField.getText();
        ViewManager.usernameView.setVisible(false);
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
        boxHeight += componentsHeight;

        GridBagConstraints gridIpAddressField = GridBagConstraintBuilder.build(0, 2, .0f, .0f, new Insets(internalBorder, 0, 0, 0));
        GridBagConstraints gridGoNextButton = GridBagConstraintBuilder.build(1, 2, .0f, .0f, new Insets(0, 0, 0, 0));

        GoNextButton goNextButton = new GoNextButton(windowFrame);
        goNextButton.setPreferredSize(new Dimension(200, componentsHeight));
        boxHeight += componentsHeight;

        this.setPreferredSize(new Dimension(boxWidth, boxHeight));
        this.add(ipAddressField, gridIpAddressField);
        this.add(goNextButton, gridGoNextButton);
        windowFrame.updateFrame();
    }
}
