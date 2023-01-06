package com.lelepaci.main;

import com.lelepaci.gui.*;
import com.lelepaci.gui.component.*;
import com.lelepaci.gui.component.Window;
import com.lelepaci.gui.windows.StartWindow;

import java.util.ArrayList;
import java.util.List;

public class Tombola {

    public static void main(String[] args) throws InterruptedException {
        new Tombola();
    }

    private WindowsManager manager;
    private WindowFrame frame;

    public Tombola(){
        frame = new WindowFrame();
        // Need this for handling N JComponenet. Maybe shoul be Singleton
        WindowPanel windowPanel = new WindowPanel();
        frame.add(windowPanel);
        manager = new WindowsManager(frame, windowPanel);
        initWindows();

        manager.loadWindow(manager.getWindow("topBar"));
    }

    public void initWindows(){
        manager.preloadWindow(new TopBar("topBar"));
        manager.preloadWindow(new StartWindow("startWindow"));
    }

}