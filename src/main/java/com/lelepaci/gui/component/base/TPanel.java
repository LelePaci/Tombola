package com.lelepaci.gui.component.base;

import com.lelepaci.gui.WindowInfos;
import com.lelepaci.gui.component.core.WindowFrame;

import javax.swing.*;

public abstract class TPanel extends JPanel implements WindowInfos {
    protected WindowFrame windowFrame;

    public TPanel(WindowFrame windowFrame){
        this.windowFrame = windowFrame;
    }
}
