package com.lelepaci.main;

import com.lelepaci.gui.component.core.WindowFrame;
import com.lelepaci.gui.component.core.WindowPanel;
import com.lelepaci.gui.view.UsernameView;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class Tombola {
    //region MUST MOVE SOMEWHERE ELSE
    public static String username = "";
    public static UsernameView startWindow = null;
    //endregion

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