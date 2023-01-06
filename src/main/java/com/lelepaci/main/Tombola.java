package com.lelepaci.main;

import com.lelepaci.gui.*;
import com.lelepaci.gui.component.*;
import com.lelepaci.gui.windows.*;

import javax.swing.*;

public class Tombola {
    public static void main(String[] args) throws InterruptedException {
        //Finestra
        WindowFrame windowFrame = new WindowFrame();
        windowFrame.setVisible(true);

        //Pannello che contiene tutti gli elementi della finestra
        WindowPanel windowPanel = new WindowPanel();
        windowFrame.add(windowPanel);

        JLabel label = new JLabel("prova");
        windowPanel.add(label);




        WindowsManager windowsManager = new WindowsManager(windowFrame, windowPanel);
        windowsManager.preloadWindow(new StartWindow("starWindow"));

        windowsManager.loadWindow("starWindow");

        Thread.sleep(5000);

        windowsManager.unloadWindow("starWindow");



    }
}
