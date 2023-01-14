package com.lelepaci.main;

import com.lelepaci.gui.core.WindowFrame;
import com.lelepaci.gui.core.WindowPanel;

public class Tombola {
    //region MUST MOVE SOMEWHERE ELSE
    public static String username = "";
    //endregion

    public static void main(String[] args) throws InterruptedException {
        new Tombola();
    }

    private WindowFrame frame;

    public Tombola(){
        frame = new WindowFrame();
        // Need this for handling N JComponenet. Maybe shoul be Singleton
        WindowPanel windowPanel = new WindowPanel(frame);
        frame.add(windowPanel);
    }
}