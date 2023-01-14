package com.lelepaci.gui.view;

import com.lelepaci.gui.component.HostBox;
import com.lelepaci.gui.component.custom.TransparentPanel;
import com.lelepaci.gui.component.base.TView;
import com.lelepaci.gui.component.core.WindowFrame;
import com.lelepaci.gui.utils.ViewManager;

import java.awt.*;

public class LobbyView extends TView {


    public LobbyView(WindowFrame windowFrame) {
        super(windowFrame);
        this.setLayout(new BorderLayout());

        TransparentPanel topPanel = new TransparentPanel();
        topPanel.setPreferredSize(new Dimension((int) WINDOW_WIDTH, (int) (WINDOW_HEIGHT * 0.15)));
        topPanel.setLayout(new GridBagLayout());

        HostBox host = new HostBox(windowFrame);

        topPanel.add(host);

        this.add(topPanel, BorderLayout.PAGE_START);

        this.setVisible(true);
        ViewManager.lobbyView = this;
    }
}
