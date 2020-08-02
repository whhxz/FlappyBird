package com.kingyuluk.flappybird.component;

import com.kingyuluk.flappybird.constant.ResourceConstant;
import com.kingyuluk.flappybird.util.FileUtils;
import com.kingyuluk.flappybird.util.NumberUtils;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.stream.Stream;

public class Cloud implements IComponentDraw {
    private static final BufferedImage[] imgs;

    static {
        imgs = Stream.of(ResourceConstant.Image.CLOUDS).map(FileUtils::loadBufferImage).toArray(BufferedImage[]::new);
    }

    private BufferedImage currentImg;
    private int speed = 2;
    private int x;
    private int y;
    private final int scaleImageWidth;
    private final int scaleImageHeight;

    public Cloud(int x, int y) {
        int randomImgIndex = NumberUtils.randomRange(0, imgs.length);
        currentImg = imgs[randomImgIndex];
        this.x = x;
        this.y = y;
        double randomScale = Math.random() + 1;
        scaleImageHeight = (int) (randomScale * currentImg.getHeight());
        scaleImageWidth = (int) (randomScale * currentImg.getWidth());
    }

    /**
     * 预算云下次绘制右边x坐标
     *
     * @return
     */
    public int rightX() {
        return x + scaleImageWidth;
    }

    @Override
    public void draw(Graphics g) {
        x -= speed;
        //只有在屏幕内才进行绘制
        if (rightX() >= 0) {
            g.drawImage(currentImg, x, y, scaleImageWidth, scaleImageHeight, null);
        }
    }
}
