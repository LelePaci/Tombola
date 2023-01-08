package com.lelepaci.gui.utils;

import com.lelepaci.gui.utils.BufferedImageLoader;

import javax.swing.*;
import java.awt.*;

public interface WindowInfos {
    //FOLDER PATH
    String RESOURCE_FOLDER = "src/main/resources/";
    String FONT_FOLDER = RESOURCE_FOLDER + "font/";
    String ICONS_FOLDER = RESOURCE_FOLDER + "icons/";
    String CURSORS_FOLDER = RESOURCE_FOLDER + "cursors/";

    //PATH
    String BEBAS_NEUE_FONT_PATH = FONT_FOLDER + "BebasNeue-Regular.ttf";
    String UNIVERSES_FONT_PATH = FONT_FOLDER + "Univers-light-normal.ttf";

    //ICONS
    ImageIcon ICON = new ImageIcon(RESOURCE_FOLDER + "icon.png");
    ImageIcon CLOSING_APP = new ImageIcon(ICONS_FOLDER + "app-closing.png");
    ImageIcon RIGHT_ARROW = new ImageIcon(ICONS_FOLDER + "right-arrow.png");

    ImageIcon CURSOR = new ImageIcon(CURSORS_FOLDER + "test.png");
//    Image CURSOR = BufferedImageLoader.loadImage(RESOURCE_FOLDER + "cursor.gif");

    //WINDOW SIZE
    double WINDOW_WIDTH = Toolkit.getDefaultToolkit().getScreenSize().getWidth() * 2 / 3;
    double WINDOW_HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().getHeight() * 2 / 3;

    //OTHER
    RadialGradientPaint RADIAL_GRADIENT_PAINT = new RadialGradientPaint((int) (WINDOW_WIDTH * 0.4), -(int) (WINDOW_HEIGHT * 1.0), (float) (WINDOW_WIDTH * 1.5), new float[]{.2f, .8f}, new Color[]{Color.decode("#C23F3F"), Color.decode("#4F1613")}, MultipleGradientPaint.CycleMethod.NO_CYCLE);
}
