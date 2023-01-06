package com.lelepaci.gui;

import javax.swing.*;
import java.awt.*;

public interface WindowInfos {
    //FOLDER PATH
    String RESOURCE_FOLDER = "src/main/resources/";
    String FONT_FOLDER = RESOURCE_FOLDER + "font/";
    String ICONS_FOLDER = RESOURCE_FOLDER + "icons/";

    //PATH
    String BEBAS_NEUE_FONT_PATH = FONT_FOLDER + "BebasNeue-Regular.ttf";

    //ICONS
    ImageIcon ICON = new ImageIcon(RESOURCE_FOLDER + "icon.png");
    ImageIcon CLOSING_APP = new ImageIcon(ICONS_FOLDER + "app-closing.png");

    //WINDOW SIZE
    double  WINDOW_WIDTH = Toolkit.getDefaultToolkit().getScreenSize().getWidth() * 2 / 3;
    double WINDOW_HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().getHeight() * 2 / 3;

    //OTHER
    RadialGradientPaint RADIAL_GRADIENT_PAINT = new RadialGradientPaint((int)(WINDOW_WIDTH * 0.4), -(int)(WINDOW_HEIGHT*2.5), (float)WINDOW_WIDTH*2, new float[]{.2f, .8f}, new Color[]{Color.decode("#C23F3F"), Color.decode("#4F1613")}, MultipleGradientPaint.CycleMethod.NO_CYCLE);

}
