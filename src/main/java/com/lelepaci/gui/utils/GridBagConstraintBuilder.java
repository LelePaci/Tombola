package com.lelepaci.gui.utils;

import java.awt.*;

public class GridBagConstraintBuilder {
    public static GridBagConstraints buildGrigBagConstraint(int gridX, int gridY, double weightX, double weightY, int gridWidth, int gridHeight){
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = gridX;
        c.gridy = gridY;
        c.weightx = weightX;
        c.weighty = weightY;
        c.gridwidth = gridWidth;
        c.gridheight = gridHeight;
        return c;
    }

    public static GridBagConstraints buildGrigBagConstraint(int gridX, int gridY, double weightX, double weightY){
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = gridX;
        c.gridy = gridY;
        c.weightx = weightX;
        c.weighty = weightY;
        return c;
    }
}
