package com.lelepaci.gui.component.core;

import com.lelepaci.gui.component.base.TPanel;
import com.lelepaci.gui.utils.ViewManager;
import com.lelepaci.gui.view.LobbyView;
import com.lelepaci.gui.view.StartView;

import java.awt.*;

public class WindowPanel extends TPanel{
    public WindowPanel(WindowFrame windowFrame) {
        super(windowFrame);
        this.setOpaque(false);
        this.setLayout(new BorderLayout());

        TopBar topBar = new TopBar(windowFrame);
        StartView startWindow = new StartView(windowFrame);
        LobbyView lobbyView = new LobbyView(windowFrame);

        this.add(lobbyView);
        this.add(startWindow);
        this.add(topBar);

        windowFrame.add(this);
        windowFrame.updateFrame();


        ViewManager.startView.setVisible(false);
        ViewManager.lobbyView.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setPaint(PRINCIPAL_RADIAL_GRADIENT_PAINT);
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
        super.paintComponent(g);
    }
}