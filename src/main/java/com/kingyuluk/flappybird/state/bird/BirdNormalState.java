package com.kingyuluk.flappybird.state.bird;

import com.kingyuluk.flappybird.component.Bird;
import com.kingyuluk.flappybird.constant.ResourceConstant;
import com.kingyuluk.flappybird.util.FileUtils;

import java.awt.image.BufferedImage;
import java.util.stream.Stream;

public class BirdNormalState implements IBirdState {
    private static final BufferedImage[] images = Stream.of(ResourceConstant.Image.BIRD_NORMALS).map(FileUtils::loadBufferImage).toArray(BufferedImage[]::new);

    @Override
    public void fly(Bird bird) {
        int counter = bird.getCounter();
        BufferedImage currentImage = images[counter / 10 % images.length];
        bird.refresh(currentImage);
    }
}
