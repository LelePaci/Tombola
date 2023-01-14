package com.lelepaci.gui.utils;

import javax.swing.*;
import java.awt.*;

public interface IGui {
    default int getLargestChildPreferredWidth() {
        int maxWidth = 0;
        if (this instanceof JComponent) {
            JComponent father = (JComponent) this;
            for (Component c : father.getComponents()) {
                JComponent child = (JComponent) c;
                int width = child.getPreferredSize().width;
                if (width > maxWidth) {
                    maxWidth =width;
                }
            }
        }
        return maxWidth;
    }
}
