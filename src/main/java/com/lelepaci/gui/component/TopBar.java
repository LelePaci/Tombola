package com.lelepaci.gui.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TopBar extends Window implements ActionListener {
    private JButton btnCloseApp;
    public TopBar(String windowName) {
        super(windowName);
        this.setOpaque(false);
        this.setPreferredSize(new Dimension((int) WINDOW_WIDTH, 25));
        this.setLayout(new FlowLayout(FlowLayout.TRAILING));

        btnCloseApp = new JButton();
        btnCloseApp.setIcon(new ImageIcon(CLOSING_APP.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        btnCloseApp.setBackground(new Color(0,0,0,0));
        btnCloseApp.setBorder(null);
        btnCloseApp.addActionListener(this);

        this.add(btnCloseApp);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
//        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        g2d.setColor(Color.PINK);
//        g2d.fillRect(0, 0, (int) WINDOW_WIDTH, 25);
        super.paintComponent(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCloseApp){
            windowsManager.closeApp();
        }
    }
}
