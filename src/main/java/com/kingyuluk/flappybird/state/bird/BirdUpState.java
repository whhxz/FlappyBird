package com.kingyuluk.flappybird.state.bird;

import com.kingyuluk.flappybird.component.Bird;
import com.kingyuluk.flappybird.constant.ResourceConstant;
import com.kingyuluk.flappybird.util.FileUtils;

import java.awt.image.BufferedImage;

public class BirdUpState implements IBirdState {
    private static final BufferedImage image = FileUtils.loadBufferImage(ResourceConstant.Image.BIRD_UP);
    @Override
    public void fly(Bird bird) {
        bird.refresh(image);
    }
}
