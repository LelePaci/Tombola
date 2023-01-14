package com.lelepaci.gui.component.base;

import com.lelepaci.gui.utils.WindowInfos;
import com.lelepaci.gui.core.WindowFrame;

import javax.swing.*;

public class TPanel extends JPanel implements WindowInfos {
    protected WindowFrame windowFrame;

    public TPanel(WindowFrame windowFrame){
        this.windowFrame = windowFrame;
    }

    @Override
    public void setVisible(boolean aFlag) {
        super.setVisible(aFlag);
        windowFrame.updateFrame();
    }
}
