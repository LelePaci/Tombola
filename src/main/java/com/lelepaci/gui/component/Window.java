package com.lelepaci.gui.component;

import com.lelepaci.gui.WindowInfos;
import com.lelepaci.gui.WindowsManager;
import com.lelepaci.gui.utils.BufferedImageLoader;

import javax.swing.*;
import java.awt.*;

public abstract class Window extends JPanel implements WindowInfos {

    protected String windowName;
    protected BufferedImageLoader loader;
    protected WindowsManager windowsManager;

    public Window(String windowName){
        this.windowName = windowName;
        this.loader = loader = new BufferedImageLoader();
    }

    public String getWindowName(){
        return windowName;
    }

    public void setWindowsManager(WindowsManager windowsManager){
        this.windowsManager = windowsManager;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("Painted: " + getWindowName());
    }
}
