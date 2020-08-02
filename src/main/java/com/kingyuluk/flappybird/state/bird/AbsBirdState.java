package com.kingyuluk.flappybird.state.bird;

import java.awt.image.BufferedImage;

public abstract class AbsBirdState implements IBirdState {
    public abstract BufferedImage getImage(int counter);
}
