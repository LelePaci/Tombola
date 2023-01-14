package com.lelepaci.gui.utils;


import javax.swing.*;
import java.awt.*;

public interface WindowInfos {
    //FOLDER PATH
    String RESOURCE_FOLDER = "src/main/resources/";
    String FONTS_FOLDER = RESOURCE_FOLDER + "fonts/";
    String ICONS_FOLDER = RESOURCE_FOLDER + "icons/";
    String CURSORS_FOLDER = RESOURCE_FOLDER + "cursors/";

    //PATH
    String BEBAS_NEUE_FONT_PATH = FONTS_FOLDER + "BebasNeue-Regular.ttf";
    String UNIVERSES_FONT_PATH = FONTS_FOLDER + "Univers-light-normal.ttf";
    String MKR_MASTON_BOLD = FONTS_FOLDER + "MRKMaston-Bold.ttf";
    String MKR_MASTON = FONTS_FOLDER + "MRKMaston-Regular.ttf";

    //ICONS
    ImageIcon ICON = new ImageIcon(RESOURCE_FOLDER + "icon.png");

    //WINDOW SIZE
    double WINDOW_WIDTH = Toolkit.getDefaultToolkit().getScreenSize().getWidth() * 2 / 3;
    double WINDOW_HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().getHeight() * 2 / 3;

    //PAINTS
    RadialGradientPaint PRINCIPAL_RADIAL_GRADIENT_PAINT = new RadialGradientPaint((int) (WINDOW_WIDTH * 0.4), -(int) (WINDOW_HEIGHT * 1.0), (float) (WINDOW_WIDTH * 1.5), new float[]{.2f, .8f}, new Color[]{Color.decode("#C23F3F"), Color.decode("#4F1613")}, MultipleGradientPaint.CycleMethod.NO_CYCLE);
    RadialGradientPaint DISABLED_RADIAL_GRADIENT_PAINT = new RadialGradientPaint((int) (WINDOW_WIDTH * 0.4), -(int) (WINDOW_HEIGHT * 1.0), (float) (WINDOW_WIDTH * 1.5), new float[]{.2f, .8f}, new Color[]{Color.decode("#a2a2a2"), Color.decode("#1a1a1a")}, MultipleGradientPaint.CycleMethod.NO_CYCLE);

    //OTHERS
}
