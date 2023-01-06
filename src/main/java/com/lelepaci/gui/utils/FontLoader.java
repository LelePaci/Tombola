package com.lelepaci.gui.utils;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;

public class FontLoader {
    public static Font loadFont(String path, float size) {
        Font font = null;
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream(path));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
        } catch (FontFormatException | IOException e) {
            throw new RuntimeException(e);
        }
        return font.deriveFont(size);
    }
}
