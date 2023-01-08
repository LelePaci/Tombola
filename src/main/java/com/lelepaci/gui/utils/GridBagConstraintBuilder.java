package com.lelepaci.gui.utils;

import java.awt.*;

public class GridBagConstraintBuilder {

    public static GridBagConstraints build(int gridX, int gridY, double weightX, double weightY){
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = gridX;
        c.gridy = gridY;
        c.weightx = weightX;
        c.weighty = weightY;
        return c;
    }

    public static GridBagConstraints build(int gridX, int gridY, double weightX, double weightY, Insets insets, int ipadX, int ipadY){
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = gridX;
        c.gridy = gridY;
        c.weightx = weightX;
        c.weighty = weightY;
        c.insets = insets;
        c.ipadx = ipadX;
        c.ipady = ipadY;
        return c;
    }

    public static GridBagConstraints build(int gridX, int gridY, double weightX, double weightY, Insets insets){
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = gridX;
        c.gridy = gridY;
        c.weightx = weightX;
        c.weighty = weightY;
        c.insets = insets;
        return c;
    }

    public static GridBagConstraints build(int gridX, int gridY, double weightX, double weightY, int gridWidth, int gridHeight){
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = gridX;
        c.gridy = gridY;
        c.weightx = weightX;
        c.weighty = weightY;
        c.gridwidth = gridWidth;
        c.gridheight = gridHeight;
        return c;
    }

    public static GridBagConstraints build(int gridX, int gridY, double weightX, double weightY, int gridWidth, int gridHeight, Insets insets){
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = gridX;
        c.gridy = gridY;
        c.weightx = weightX;
        c.weighty = weightY;
        c.gridwidth = gridWidth;
        c.gridheight = gridHeight;
        c.insets = insets;
        return c;
    }
}
