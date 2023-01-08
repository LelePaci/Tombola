package com.lelepaci.gui.windows;

import com.lelepaci.gui.component.UsernameInputBox;
import com.lelepaci.gui.component.base.TPanel;
import com.lelepaci.gui.component.WindowFrame;
import com.lelepaci.gui.utils.FontLoader;
import com.lelepaci.gui.utils.GridBagConstraintBuilder;

import javax.swing.*;
import java.awt.*;

public class StartWindow extends TPanel {
    public StartWindow(WindowFrame windowFrame) {
        super(windowFrame);
        this.setOpaque(false);
        this.setPreferredSize(new Dimension((int)WINDOW_WIDTH, (int) WINDOW_HEIGHT - 25));
        this.setBounds(0, 25, (int) WINDOW_WIDTH, (int) WINDOW_HEIGHT - 25);
        this.setLayout(new GridBagLayout());



        //COMPONENTS
        JLabel labelTitle = new JLabel("Tombola");
        labelTitle.setFont(FontLoader.loadFont(BEBAS_NEUE_FONT_PATH, 150));
        labelTitle.setForeground(Color.WHITE);
        labelTitle.setVisible(true);

        UsernameInputBox nicknameInputBox = new UsernameInputBox(windowFrame);
        nicknameInputBox.setPreferredSize(new Dimension(600, 75));



        //GRIDBAG CONSTRAINTS
        GridBagConstraints gridLabelTitle = GridBagConstraintBuilder.buildGrigBagConstraint(0,0,0.0f,.0f, new Insets(0,0,185,0));
        GridBagConstraints gridInputBox = GridBagConstraintBuilder.buildGrigBagConstraint(0,1,0.0f,.0f, new Insets(0,0,0,0));

        this.add(labelTitle, gridLabelTitle);
        this.add(nicknameInputBox, gridInputBox);
        System.out.println("loaded StarWindow");
        this.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        g2d.setColor(Color.YELLOW);
//        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2d.setColor(Color.YELLOW);
//        g2d.fillRoundRect(0, 0, 600, 100, 15, 15);


//        g2d.drawImage(BufferedImageLoader.loadImage(RESOURCE_FOLDER));

        System.out.println("painted StarWindow");
        super.paintComponent(g);
    }
}