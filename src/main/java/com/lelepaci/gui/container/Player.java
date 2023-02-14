package com.lelepaci.gui.container;

import com.lelepaci.gui.component.custom.EmptyBox;
import com.lelepaci.gui.core.WindowFrame;
import com.lelepaci.gui.other.PlayerLobbyInfo;
import com.lelepaci.gui.utils.FontLoader;
import com.lelepaci.gui.utils.GridBagConstraintsBuilder;

import javax.swing.*;
import java.awt.*;

public class Player extends EmptyBox {
    private int y, boxWidth, boxHeight;
    private int position;
    private PlayerLobbyInfo lobbyInfo;

    public Player(int y, int boxWidth, int position, PlayerLobbyInfo lobbyInfo) {
        super(2);
        this.y = y;
        this.boxWidth = boxWidth;
        this.boxHeight = 100;
        this.setBounds(0, y, boxWidth, boxHeight);
        setPosition(position);
        this.lobbyInfo = lobbyInfo;

        setLayout(new GridBagLayout());

        displayPlayerInfo();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color);
        switch (position) {

            case 1:
                // border radius sopra
                g2d.fillRect(0, boxHeight - arcRadius, getWidth(), arcRadius);
                g2d.setColor(Color.black);
                g2d.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
                break;
            case 2:
                // border radius sotto
                g2d.fillRect(0, 0, getWidth(), arcRadius);
                g2d.setColor(Color.black);
//                g2d.drawLine(0, 1, getWidth(), 1);
                break;

            case 3:
                // no border radius
                g2d.fillRect(0, 0, getWidth(), arcRadius);
                g2d.fillRect(0, boxHeight - arcRadius, getWidth(), arcRadius);
                g2d.setColor(Color.black);
                g2d.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
                break;
            case 0:
            default:
                break;
        }
    }

    public int getTotalHeight() {
        return y + getHeight();
    }

    public void setPosition(int position) {
        if (position >= 0 && position <= 3) {
            this.position = position;
            windowFrame.updateFrame();
        } else {
            throw new RuntimeException("Invalid position value");
        }
    }

    public void displayPlayerInfo(){
        JLabel number = new JLabel("#" + lobbyInfo.getPos());
        number.setFont(FontLoader.loadFont(BEBAS_NEUE_FONT_PATH, 30));
        GridBagConstraints numberLayout = GridBagConstraintsBuilder.build(0,0,.0f, .0f);

        JLabel username = new JLabel(lobbyInfo.getUsername());
        username.setFont(FontLoader.loadFont(UNIVERSES_FONT_PATH, 30));
        GridBagConstraints usernameLayout = GridBagConstraintsBuilder.build(1,0,.1f, .0f);

        this.add(number, numberLayout);
        this.add(username, usernameLayout);
        System.out.println(lobbyInfo.getUsername());
    }

}
