package com.kingyuluk.flappybird.component;

import com.kingyuluk.flappybird.constant.BirdStateEnum;
import com.kingyuluk.flappybird.constant.FrameConstant;
import com.kingyuluk.flappybird.state.bird.BirdStateManager;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Bird implements IComponentDraw {
    private BirdStateEnum birdState;
    private BufferedImage image;
    private int counter;
    private int x;
    private int y;

    public Bird() {
        birdState = BirdStateEnum.NORMAL;
        x = FrameConstant.WIDTH >> 2;
        y = FrameConstant.HEIGHT >> 1;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(image, x, y, null);
    }

    public void count() {
        if (counter == Integer.MAX_VALUE) {
            counter = 0;
        }
        counter++;
    }

    public void refresh(BufferedImage image){
        this.image = image;
    }
    public void refresh(BufferedImage image, int x, int y){
        this.image = image;
        this.x = x;
        this.y = y;
    }


    public int getCounter() {
        return counter;
    }

    public BirdStateEnum getBirdState() {
        return birdState;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
