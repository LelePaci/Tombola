package com.lelepaci.gui.component.core;

import com.lelepaci.gui.component.base.TPanel;
import com.lelepaci.gui.component.button.CloseAppButton;
import com.lelepaci.gui.utils.FontLoader;
import com.lelepaci.gui.utils.GridBagConstraintBuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class TopBar extends TPanel {

    private int x, y;
    public TopBar(WindowFrame windowFrame) {
        super(windowFrame);
        this.setOpaque(false);
        this.setPreferredSize(new Dimension((int) WINDOW_WIDTH, 25));
        this.setLayout(new GridBagLayout());

        //COMPONENTS
        JLabel labelTitle = new JLabel("Tombola");
        labelTitle.setFont(FontLoader.loadFont(BEBAS_NEUE_FONT_PATH, 15));
        labelTitle.setForeground(Color.white);
        labelTitle.setBorder(BorderFactory.createEmptyBorder(2,5,0,0));

        CloseAppButton btn = new CloseAppButton(windowFrame);

        JPanel draggable = new EmptyPanel();

        int draggableWidth = this.getPreferredSize().width - (int)(btn.getPreferredSize().width) - (int)(labelTitle.getPreferredSize().width);
        draggable.setPreferredSize(new Dimension(draggableWidth, this.getPreferredSize().height));
        draggable.setVisible(true);

        //GRIDBAG CONSTRAINTS
        GridBagConstraints gridLabelTitle = GridBagConstraintBuilder.build(0,0,0.0f,0.0f);
        GridBagConstraints gridDraggable = GridBagConstraintBuilder.build(1,0,1.0f,0.0f);
        GridBagConstraints gridCloseAppButton = GridBagConstraintBuilder.build(2,0,0.0f,0.0f);
        GridBagConstraints gridEmptySpace = GridBagConstraintBuilder.build(0,1,0.0f,1.0f, 2,1);

        //MOUSE EVENTS
        draggable.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX() + labelTitle.getPreferredSize().width;
                y = e.getY();
            }
        });

        draggable.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                windowFrame.setLocation((e.getXOnScreen() - x), (e.getYOnScreen() - y));
            }
        });

        labelTitle.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Desktop desk = Desktop.getDesktop();
                try {
                    desk.browse(new URI("https://github.com/LelePaci/Tombola"));
                } catch (IOException | URISyntaxException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        this.add(labelTitle, gridLabelTitle);
        this.add(draggable,gridDraggable);
        this.add(btn,gridCloseAppButton);
        this.add(new EmptyPanel(), gridEmptySpace);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //#121212
        //#4F1613
        g2d.setColor(Color.decode("#260B09"));
        g2d.fillRoundRect(0, 0, (int) WINDOW_WIDTH, 25, 10, 10);
        g2d.fillRect(0, 22, (int) WINDOW_WIDTH, 3);
        super.paintComponent(g);
    }
}
