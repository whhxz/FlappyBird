package com.kingyuluk.flappybird.game;

import com.kingyuluk.flappybird.component.Bird;
import com.kingyuluk.flappybird.constant.GameStateEnum;
import com.kingyuluk.flappybird.state.bird.BirdStateManager;
import com.kingyuluk.flappybird.state.game.GameStateManager;

public class Gamer {
    private GameStateEnum gameState;
    private GameStateManager gameStateManager;
    private BirdStateManager birdStateManager;
    private Bird bird;

    public Gamer(Bird bird) {
        gameState = GameStateEnum.READY;
        this.gameStateManager = GameStateManager.build();
        this.birdStateManager = BirdStateManager.build();
        this.bird = bird;
    }

    public void play(){
        birdStateManager.fly(bird);
    }

    public GameStateEnum getGameState() {
        return gameState;
    }

    public Bird getBird() {
        return bird;
    }
}
