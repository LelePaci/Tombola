package com.lelepaci.gui.other;

public class PlayerLobbyInfo {
    private String username;
    private int pos;

    public PlayerLobbyInfo(String username, int pos) {
        this.username = username;
        this.pos = pos;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
}
