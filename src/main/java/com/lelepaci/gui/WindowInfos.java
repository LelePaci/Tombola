package com.lelepaci.gui;

import javax.swing.*;
import java.awt.*;

public interface WindowInfos {
    String RESOURCE_FOLDER = "src/main/resources/";
    ImageIcon ICON = new ImageIcon("src/main/resources/smile.png");
    double  WINDOW_WIDTH = Toolkit.getDefaultToolkit().getScreenSize().getWidth() * 2 / 3;
    double WINDOW_HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().getHeight() * 2 / 3;
}
