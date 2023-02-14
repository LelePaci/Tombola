package com.lelepaci.gui.core;

import com.lelepaci.gui.component.base.TPanel;
import com.lelepaci.gui.utils.ViewManager;
import com.lelepaci.gui.container.LobbyView;
import com.lelepaci.gui.container.StartView;

import java.awt.*;

public class WindowPanel extends TPanel{
    public WindowPanel() {
        this.setOpaque(false);
        this.setLayout(new BorderLayout());

        TopBar topBar = new TopBar();
        StartView startWindow = new StartView();
        LobbyView lobbyView = new LobbyView();

        this.add(lobbyView);
        this.add(startWindow);
        this.add(topBar);

        windowFrame.add(this);
        windowFrame.updateFrame();

        ViewManager.startView.setVisible(true);
        ViewManager.lobbyView.setVisible(false);
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