package com.kingyuluk.flappybird.component;


import com.kingyuluk.flappybird.constant.FrameConstant;
import com.kingyuluk.flappybird.constant.ResourceConstant;
import com.kingyuluk.flappybird.util.FileUtils;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Objects;
import java.util.stream.IntStream;

public class BackgroundBottom implements IComponentDraw {
    private static final BufferedImage IMAGE = FileUtils.loadBufferImage(ResourceConstant.Image.BG_BOTTOM);
    //图片信息
    private static final int IMG_WIDTH = Objects.requireNonNull(IMAGE).getWidth();
    private static final int IMG_HEIGHT = IMAGE.getHeight();
    private static int IMAGE_DRAW_COUNT = FrameConstant.WIDTH / IMG_WIDTH + 2;

    private int speed = 1;
    private int layerX = 0;

    @Override
    public void draw(Graphics g) {
        IntStream.range(0, IMAGE_DRAW_COUNT)
                .forEach(i -> g.drawImage(IMAGE, IMG_WIDTH * i - layerX, FrameConstant.HEIGHT - IMG_HEIGHT, null));
        imageMove();

    }

    private void imageMove(){
        layerX += speed;
        if (layerX >= IMG_WIDTH){
            layerX = 0;
        }
    }
}
