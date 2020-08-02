package com.kingyuluk.flappybird.game;

import com.kingyuluk.flappybird.component.Background;
import com.kingyuluk.flappybird.component.Bird;
import com.kingyuluk.flappybird.component.IComponentDraw;

import java.awt.*;
import java.awt.image.BufferedImage;

import static com.kingyuluk.flappybird.constant.Constant.FRAME_HEIGHT;
import static com.kingyuluk.flappybird.constant.Constant.FRAME_WIDTH;


public class GameGraphics implements IComponentDraw {
    private Background background;
    private Bird bird;
    private final BufferedImage bufImg = new BufferedImage(FRAME_WIDTH, FRAME_HEIGHT, BufferedImage.TYPE_4BYTE_ABGR);

    public GameGraphics(Bird bird) {
        this.background = new Background();
        this.bird = bird;
    }

    @Override
    public void draw(Graphics g) {
        Graphics bufG = bufImg.getGraphics();
        background.draw(bufG);
        bird.draw(bufG);
        g.drawImage(bufImg, 0, 0, null);

    }
}
