package com.kingyuluk.flappybird.state.bird;

import com.kingyuluk.flappybird.component.Bird;
import com.kingyuluk.flappybird.constant.BirdStateEnum;

import java.util.HashMap;
import java.util.Map;

public class BirdStateManager {
    private static BirdStateManager birdStateManager = new BirdStateManager();
    private Map<BirdStateEnum, IBirdState> states = new HashMap<>();

    public static BirdStateManager build() {
        return birdStateManager;
    }

    private BirdStateManager() {
        states.put(BirdStateEnum.NORMAL, new BirdNormalState());
        states.put(BirdStateEnum.UP, new BirdUpState());
    }

    public void fly(Bird bird) {
        bird.count();
        BirdStateEnum birdState = bird.getBirdState();
        if (birdState != BirdStateEnum.DEAD) {
            bird.count();
        }
        IBirdState absBirdState = states.get(birdState);
        absBirdState.fly(bird);
    }
}
