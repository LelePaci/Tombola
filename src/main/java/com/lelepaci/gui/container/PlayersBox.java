package com.lelepaci.gui.container;

import com.lelepaci.gui.component.base.TPanel;
import com.lelepaci.gui.component.custom.EmptyBox;
import com.lelepaci.gui.component.custom.TransparentPanel;
import com.lelepaci.gui.core.WindowFrame;
import com.lelepaci.gui.other.PlayerLobbyInfo;
import com.lelepaci.main.Tombola;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.util.ArrayList;
import java.util.List;

public class PlayersBox extends EmptyBox {
    private int maxHeight = 500;
    private TransparentPanel playersPanel;
    private int lastMaxHeight = 0;
    private JScrollPane playerScrollPane;
    private List<Player> playerList = new ArrayList<>();

    public PlayersBox(WindowFrame windowFrame) {
        super(1, 10);
        this.setPreferredSize(new Dimension(500, 500));
        this.setLayout(new FlowLayout());
        addPlayerList();

        this.setVisible(true);
    }

    public void addPlayerList() {
        playersPanel = new TransparentPanel();
        playersPanel.setLayout(null);
        playerScrollPane = new JScrollPane();

        playerScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        playerScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        playerScrollPane.setViewportView(playersPanel);
        playerScrollPane.setBackground(new Color(0, 0, 0, 0));
        playerScrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));

        playerScrollPane.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                windowFrame.updateFrame();
            }
        });

        this.add(playerScrollPane);

        addPlayer(Tombola.username);
        playerScrollPane.setPreferredSize(new Dimension(getPreferredSize().width - 5, getPreferredSize().height - 5));
    }

    public void addPlayer(String username) {
        PlayerLobbyInfo lobbyInfo = new PlayerLobbyInfo(username, playerList.size() + 1);
        if (playerList.size() == 0) {
            playerList.add(new Player(lastMaxHeight, getPreferredSize().width - 7, 0, lobbyInfo));
        } else {
            Player last = playerList.get(playerList.size() - 1);
            last.setPosition((playerList.size() > 1) ? 3 : 1);
            playerList.add(new Player(lastMaxHeight, getPreferredSize().width - 7, 2, lobbyInfo));
        }
        lastMaxHeight = playerList.get(playerList.size() - 1).getTotalHeight();

        playersPanel.setPreferredSize(new Dimension(200, lastMaxHeight));
        for (Player player : playerList) {
            player.setVisible(true);
            playersPanel.add(player);
        }

        playersPanel.validate();
        playersPanel.repaint();

        windowFrame.updateFrame();
    }
}

