package com.lelepaci.gui.component;

import com.lelepaci.gui.component.base.InputBox;
import com.lelepaci.gui.component.base.TTextField;
import com.lelepaci.gui.utils.FontLoader;
import com.lelepaci.gui.utils.GridBagConstraintBuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class UsernameInputBox extends InputBox {
    public UsernameInputBox(WindowFrame windowFrame) {
        super(windowFrame);
        this.setLayout(new GridBagLayout());

        Font currentFont = FontLoader.loadFont(UNIVERSES_FONT_PATH, 18);
        //COMPONENTS
        TTextField username = new TTextField("Inserisci username", 18);

        username.setPreferredSize(new Dimension(400, 50));
        username.setMinimumSize(new Dimension(400, 50));

        GoNextButton goNext = new GoNextButton(windowFrame);
        goNext.setPreferredSize(new Dimension(100, 50));

        //EVENTS
        username.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                username.hidePlaceholder();
            }

            @Override
            public void focusLost(FocusEvent e) {
                username.showPlaceholder();
            }
        });

        //LAYOUTS
        GridBagConstraints gridUsername= GridBagConstraintBuilder.buildGrigBagConstraint(0,0,.8f,.0f, new Insets(0,30,0,0));
        GridBagConstraints gridButton = GridBagConstraintBuilder.buildGrigBagConstraint(1,0,.2f,.0f, new Insets(0,0,0,30));

        this.add(username, gridUsername);
        this.add(goNext, gridButton);
    }
}
