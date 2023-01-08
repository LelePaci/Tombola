package com.lelepaci.main;

import com.lelepaci.gui.*;
import com.lelepaci.gui.component.*;
import com.lelepaci.gui.windows.StartWindow;

public class Tombola {

    public static void main(String[] args) throws InterruptedException {
        new Tombola();
    }

//    private WindowsManager manager;
    private WindowFrame frame;

    public Tombola(){
        frame = new WindowFrame();
        // Need this for handling N JComponenet. Maybe shoul be Singleton
        WindowPanel windowPanel = new WindowPanel(frame);
        frame.add(windowPanel);
    }
}