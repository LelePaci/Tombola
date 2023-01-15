package com.lelepaci.gui.container;

import com.lelepaci.gui.component.base.TPanel;
import com.lelepaci.gui.component.custom.EmptyBox;
import com.lelepaci.gui.component.custom.TransparentPanel;
import com.lelepaci.gui.core.WindowFrame;
import com.lelepaci.main.Tombola;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class PlayersBox extends EmptyBox {
    private int maxHeight = 500;
    private TransparentPanel playersPanel;
    private int lastMaxHeight = 0;
    private JScrollPane playerScrollPane;

    public PlayersBox(WindowFrame windowFrame) {
        super(windowFrame, 1);
        this.setPreferredSize(new Dimension(500, 500));
        this.setLayout(new FlowLayout());
        addPlayerList();

        this.setVisible(true);
    }

    public void addPlayerList() {
        playersPanel = new TransparentPanel(windowFrame);
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

        addPlayer(Tombola.username, 0);
        playerScrollPane.setPreferredSize(new Dimension(getPreferredSize().width - 5, 150));
    }

    public void addPlayer(String username, int position) {
        Player player = new Player(windowFrame, position, lastMaxHeight, getPreferredSize().width - 7);
        lastMaxHeight = player.getTotalHeight();

        playersPanel.setPreferredSize(new Dimension(200, lastMaxHeight));
        player.setVisible(true);

        playersPanel.add(player);
        playersPanel.validate();
        playersPanel.repaint();

        windowFrame.updateFrame();
    }
}
