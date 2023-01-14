package com.lelepaci.gui.utils;

import java.awt.*;

public class GridBagConstraintsBuilder {

    /**
     *
     * @param gridX Position of the Cell on X axis
     * @param gridY Position of the Cell on Y axis
     * @param weightX Value between 0.0 and 1.0. Larger numbers indicate that the component's row or column should get more space.
     * @param weightY Value between 0.0 and 1.0. Larger numbers indicate that the component's row or column should get more space.
     * @return new GridBagConstraints
     */
    public static GridBagConstraints build(int gridX, int gridY, double weightX, double weightY){
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = gridX;
        c.gridy = gridY;
        c.weightx = weightX;
        c.weighty = weightY;
        return c;
    }

    /**
     *
     * @param gridX Position of the Cell on X axis
     * @param gridY Position of the Cell on Y axis
     * @param weightX Value between 0.0 and 1.0. Larger numbers indicate that the component's row or column should get more space.
     * @param weightY Value between 0.0 and 1.0. Larger numbers indicate that the component's row or column should get more space.
     * @param insets External padding of the cell
     * @return new GridBagConstraints
     */
    public static GridBagConstraints build(int gridX, int gridY, double weightX, double weightY, Insets insets){
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = gridX;
        c.gridy = gridY;
        c.weightx = weightX;
        c.weighty = weightY;
        c.insets = insets;
        return c;
    }

    /**
     *
     * @param gridX Position of the Cell on X axis
     * @param gridY Position of the Cell on Y axis
     * @param weightX Value between 0.0 and 1.0. Larger numbers indicate that the component's row or column should get more space.
     * @param weightY Value between 0.0 and 1.0. Larger numbers indicate that the component's row or column should get more space.
     * @param gridWidth Number of columns that the componennt occupies
     * @param gridHeight Number of rows that the componennt occupies
     * @return new GridBagConstraints
     */
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

    /**
     *
     * @param gridX Position of the Cell on X axis
     * @param gridY Position of the Cell on Y axis
     * @param weightX Value between 0.0 and 1.0. Larger numbers indicate that the component's row or column should get more space.
     * @param weightY Value between 0.0 and 1.0. Larger numbers indicate that the component's row or column should get more space.
     * @param gridWidth Number of columns that the componennt occupies
     * @param gridHeight Number of rows that the componennt occupies
     * @param insets External padding of the cell
     * @return new GridBagConstraints
     */
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
    /**
     *
     * @param gridX Position of the Cell on X axis
     * @param gridY Position of the Cell on Y axis
     * @param weightX Value between 0.0 and 1.0. Larger numbers indicate that the component's row or column should get more space.
     * @param weightY Value between 0.0 and 1.0. Larger numbers indicate that the component's row or column should get more space.
     * @param insets External padding of the cell
     * @param anchor
     * @return new GridBagConstraints
     */
    public static GridBagConstraints build(int gridX, int gridY, double weightX, double weightY, Insets insets, int anchor){
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = gridX;
        c.gridy = gridY;
        c.weightx = weightX;
        c.weighty = weightY;
        c.insets = insets;
        c.anchor = anchor;
        return c;
    }

    /**
     *
     * @param gridX Position of the Cell on X axis
     * @param gridY Position of the Cell on Y axis
     * @param weightX Value between 0.0 and 1.0. Larger numbers indicate that the component's row should get more space.
     * @param weightY Value between 0.0 and 1.0. Larger numbers indicate that the component's column should get more space.
     * @param gridWidth Number of columns that the componennt occupies
     * @param gridHeight Number of rows that the componennt occupies
     * @param insets External padding of the cell
     * @param anchor
     * @return new GridBagConstraints
     */
    public static GridBagConstraints build(int gridX, int gridY, double weightX, double weightY, int gridWidth, int gridHeight, Insets insets, int anchor){
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = gridX;
        c.gridy = gridY;
        c.weightx = weightX;
        c.weighty = weightY;
        c.gridwidth = gridWidth;
        c.gridheight = gridHeight;
        c.insets = insets;
        c.anchor = anchor;
        return c;
    }
}
