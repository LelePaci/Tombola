package com.lelepaci.gui.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedImageLoader {

    public static BufferedImage loadImage(String path){
        BufferedImage image;
        try {
            image =ImageIO.read(new FileInputStream(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return image;
    }
}
