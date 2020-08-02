package com.kingyuluk.flappybird.util;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

public class FileUtils {
    public static BufferedImage loadBufferImage(String path){
        try {
            return ImageIO.read(new FileInputStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
