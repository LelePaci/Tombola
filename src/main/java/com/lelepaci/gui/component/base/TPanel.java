package com.lelepaci.gui.component.base;

import com.lelepaci.gui.WindowInfos;
import com.lelepaci.gui.component.WindowFrame;
import com.lelepaci.gui.utils.BufferedImageLoader;

import javax.swing.*;
import java.awt.*;

public abstract class TPanel extends JPanel implements WindowInfos {
    protected String panelName;
    protected BufferedImageLoader loader;
    protected WindowFrame windowFrame;

    public TPanel(WindowFrame windowFrame, String panelName){
        this.panelName = panelName;
        this.windowFrame = windowFrame;
        this.loader = loader = new BufferedImageLoader();
    }

    public TPanel(WindowFrame windowFrame) {
        this.panelName = null;
        this.windowFrame = windowFrame;
        this.loader = loader = new BufferedImageLoader();
    }

    public String getWindowName(){
        return panelName;
    }
}
