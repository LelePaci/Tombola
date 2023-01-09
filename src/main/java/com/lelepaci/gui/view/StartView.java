package com.lelepaci.gui.view;

import com.lelepaci.gui.component.TransparentPanel;
import com.lelepaci.gui.component.UsernameInputBox;
import com.lelepaci.gui.component.base.TPanel;
import com.lelepaci.gui.component.core.WindowFrame;
import com.lelepaci.gui.utils.FontLoader;
import com.lelepaci.gui.utils.GridBagConstraintBuilder;
import com.lelepaci.gui.utils.ViewManager;

import javax.swing.*;
import java.awt.*;

public class StartView extends TPanel {
    public StartView(WindowFrame windowFrame) {
        super(windowFrame);
        this.setOpaque(false);
        this.setPreferredSize(new Dimension((int)WINDOW_WIDTH, (int) WINDOW_HEIGHT - 25));
        this.setBounds(0, 25, (int) WINDOW_WIDTH, (int) WINDOW_HEIGHT - 25);
        this.setLayout(new BorderLayout());

        //COMPONENTS
        JLabel labelTitle = new JLabel("Tombola");
        labelTitle.setFont(FontLoader.loadFont(BEBAS_NEUE_FONT_PATH, 150));
        labelTitle.setForeground(Color.WHITE);
        labelTitle.setVisible(true);

        UsernameInputBox usernameInputBox = new UsernameInputBox(windowFrame);

//        GridBagConstraints gridLabelTitle = GridBagConstraintBuilder.build(0,0,0.0f,.0f, new Insets(-150,0,0,0), GridBagConstraints.PAGE_START);
        GridBagConstraints gridInputBox = GridBagConstraintBuilder.build(0,1,0.0f,.0f, new Insets(0,0,0,0));

        TransparentPanel topPanel = new TransparentPanel();
        topPanel.setPreferredSize(new Dimension(this.getPreferredSize().width, (int) (WINDOW_HEIGHT * 0.4)));
        topPanel.setLayout(new GridBagLayout());
        topPanel.add(labelTitle);

        this.add(topPanel, BorderLayout.PAGE_START);

        TransparentPanel bottomPanel = new TransparentPanel();
        bottomPanel.setPreferredSize(new Dimension(this.getPreferredSize().width, (int) (WINDOW_HEIGHT - topPanel.getPreferredSize().height)));
        bottomPanel.setLayout(new GridBagLayout());
        System.out.println(bottomPanel.getPreferredSize());
        bottomPanel.add(usernameInputBox, gridInputBox);
        this.add(bottomPanel, BorderLayout.PAGE_END);

        this.setVisible(true);
        ViewManager.usernameView = this;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        super.paintComponent(g);
    }
}