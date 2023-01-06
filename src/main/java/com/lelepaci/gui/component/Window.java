package com.lelepaci.gui.component;

import javax.swing.*;

public abstract class Window extends JPanel {

    protected String windowName;
    public Window(String windowName){
        this.windowName = windowName;
    }
    public String getWindowName(){
        return windowName;
    }
}
