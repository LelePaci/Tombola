package com.lelepaci.gui.component.base;

import com.lelepaci.gui.WindowInfos;
import com.lelepaci.gui.component.WindowFrame;
import com.lelepaci.gui.utils.BufferedImageLoader;

import javax.swing.*;
import java.awt.*;

public abstract class TPanel extends JPanel implements WindowInfos {
    protected WindowFrame windowFrame;

    public TPanel(WindowFrame windowFrame){
        this.windowFrame = windowFrame;
    }
}
