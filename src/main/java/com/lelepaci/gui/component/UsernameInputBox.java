package com.lelepaci.gui.component;

import com.lelepaci.connection.Utils;
import com.lelepaci.gui.component.base.EmptyBox;
import com.lelepaci.gui.component.base.TTextField;
import com.lelepaci.gui.component.button.GoNextButton;
import com.lelepaci.gui.component.core.WindowFrame;
import com.lelepaci.gui.utils.FontLoader;
import com.lelepaci.gui.utils.GridBagConstraintBuilder;
import com.lelepaci.gui.utils.ViewManager;
import com.lelepaci.main.Tombola;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.IOException;

public class UsernameInputBox extends EmptyBox {
    public UsernameInputBox(WindowFrame windowFrame) {
        super(windowFrame);
        this.setLayout(new GridBagLayout());

        Font currentFont = FontLoader.loadFont(UNIVERSES_FONT_PATH, 18);
        //COMPONENTS
        TTextField usernameField = new TTextField("Inserisci username", 18);

        usernameField.setPreferredSize(new Dimension(400, 50));
        usernameField.setMinimumSize(new Dimension(400, 50));

        GoNextButton goNext = new GoNextButton(windowFrame);
        goNext.setPreferredSize(new Dimension(100, 50));

        //EVENTS
        usernameField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                usernameField.hidePlaceholder();
            }

            @Override
            public void focusLost(FocusEvent e) {
                usernameField.showPlaceholder();
            }
        });

        goNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!usernameField.getText().equals(usernameField.getPlaceholder())){
                    if (usernameField.getText().length() > 4) {
                        Tombola.username = usernameField.getText();
                        ViewManager.usernameView.setVisible(false);
                    }
                }
            }
        });



        //LAYOUTS
        GridBagConstraints gridUsername= GridBagConstraintBuilder.build(0,0,.8f,.0f, new Insets(0,30,0,0));
        GridBagConstraints gridButton = GridBagConstraintBuilder.build(1,0,.2f,.0f, new Insets(0,0,0,30));

        this.add(usernameField, gridUsername);
        this.add(goNext, gridButton);
    }
}
