package com.kingyuluk.flappybird.state.game;

import com.kingyuluk.flappybird.constant.GameStateEnum;
import com.kingyuluk.flappybird.game.Gamer;

import java.util.HashMap;
import java.util.Map;

public class GameStateManager {
    private static GameStateManager gameStateManager = new GameStateManager();
    private Map<GameStateEnum, IGameState> states = new HashMap<>();

    public static GameStateManager build(){
        return gameStateManager;
    }
    private GameStateManager() {
        states.put(GameStateEnum.READY, new GameReadyState());
    }

    public void game(Gamer gamer){
        IGameState gameState = states.get(gamer.getGameState());
    }

    public void ready(Gamer gamer) {
    }
}
