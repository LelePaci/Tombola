package com.lelepaci.gui.container;

import com.lelepaci.gui.component.custom.RedButton;
import com.lelepaci.gui.component.custom.TransparentPanel;
import com.lelepaci.gui.component.base.TView;
import com.lelepaci.gui.core.WindowFrame;
import com.lelepaci.gui.utils.ViewManager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LobbyView extends TView {

    private PlayersBox playersBox;

    public LobbyView(WindowFrame windowFrame) {
        super(windowFrame);
        this.setLayout(new BorderLayout());

        addTopPanel();
        addMiddlePanel();
        addBottomPanel();

        this.setVisible(true);
        ViewManager.lobbyView = this;
    }

    private void addTopPanel() {
        TransparentPanel topPanel = new TransparentPanel(windowFrame);
        topPanel.setPreferredSize(new Dimension((int) WINDOW_WIDTH, (int) (WINDOW_HEIGHT * 0.15)));
        topPanel.setLayout(new GridBagLayout());

        HostBox host = new HostBox(windowFrame);
        topPanel.add(host);

        this.add(topPanel, BorderLayout.PAGE_START);
    }

    private void addMiddlePanel() {
        TransparentPanel middlePanel = new TransparentPanel(windowFrame);
        middlePanel.setPreferredSize(new Dimension((int) WINDOW_WIDTH, (int) (WINDOW_HEIGHT * 0.75)));
        middlePanel.setLayout(new GridBagLayout());

        playersBox = new PlayersBox(windowFrame);
        middlePanel.add(playersBox);

        this.add(middlePanel, BorderLayout.CENTER);
    }

    private void addBottomPanel(){
        TransparentPanel bottomPanel = new TransparentPanel(windowFrame);
        bottomPanel.setPreferredSize(new Dimension((int) WINDOW_WIDTH, (int) (WINDOW_HEIGHT * 0.10)));
        bottomPanel.setLayout(new GridBagLayout());

        RedButton exitButton = new RedButton(windowFrame ,"Esci", new Dimension(200, 50));
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                loadStartView();
                addPlayer("prova");

            }
        });

        bottomPanel.add(exitButton);

        this.add(bottomPanel, BorderLayout.PAGE_END);
    }

    private void loadStartView(){
        ViewManager.lobbyView.setVisible(false);
        ViewManager.startView.setVisible(true);
    }

    public void addPlayer(String username){
        playersBox.addPlayer(username, 1);
    }
}
