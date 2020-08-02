package com.kingyuluk.flappybird.game;

import com.kingyuluk.flappybird.component.Bird;
import com.kingyuluk.flappybird.constant.FrameConstant;
import com.kingyuluk.flappybird.listener.BirdKeyListener;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.TimeUnit;


/**
 * GameFrameV1
 *
 * @author xuzhuo
 * 2020/8/1
 */
public class GameFrameV1 extends Frame {
    private GameGraphics gameGraphics;
    private Gamer gamer;

    public GameFrameV1() {
        initFrame();
        setVisible(true);
        Bird bird = new Bird();
        this.gamer = new Gamer(bird);
        gameGraphics = new GameGraphics(bird);
    }

    private void initFrame() {
        setSize(FrameConstant.WIDTH, FrameConstant.HEIGHT);
        setTitle(FrameConstant.GAME_TITLE);
        setLocation(FrameConstant.COORDINATE_X, FrameConstant.COORDINATE_Y);
        setResizable(false);
        setBackground(FrameConstant.BG_COLOR);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        addKeyListener(new BirdKeyListener());
    }

    @Override
    public void update(Graphics g) {
        gamer.play();
        gameGraphics.draw(g);
    }

    public void start() {
        new Thread(() -> {
            while (true) {
                //如果渲染线程处理较慢，不知道会不会出现堆积
                this.repaint();
                try {
                    TimeUnit.MILLISECONDS.sleep(1000 / 60);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
