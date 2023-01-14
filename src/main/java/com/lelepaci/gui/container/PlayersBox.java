package com.lelepaci.gui.container;

import com.lelepaci.gui.component.base.TPanel;
import com.lelepaci.gui.component.custom.EmptyBox;
import com.lelepaci.gui.core.WindowFrame;

import javax.swing.*;
import java.awt.*;

public class PlayersBox extends EmptyBox {
    private int maxHeight = 500;
    private JScrollPane playerScrollPane;
    private TPanel playersPanel;

    public PlayersBox(WindowFrame windowFrame) {
        super(windowFrame);
        this.setPreferredSize(new Dimension(500, 1000));


        addPlayerList();

        this.setPreferredSize(new Dimension(500, 500));
//        this.setPreferredSize(new Dimension(getLargestChildPreferredWidth() + 10, 500));
        this.setVisible(true);
    }

    public void addPlayerList(){
        playersPanel = new TPanel(windowFrame);

        
        JScrollPane playerScrollPane = new JScrollPane();
        playerScrollPane.setViewportView();
        this.add(playerScrollPane);
    }

    public void addPlayer(String username){

    }
}
