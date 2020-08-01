package com.kingyuluk.flappybird.game;

import com.kingyuluk.flappybird.constant.FrameConstant;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * GameFrameV1
 *
 * @author xuzhuo
 * 2020/8/1
 */
public class GameFrameV1 extends Frame {
    public GameFrameV1() {
        initFrame();
        setVisible(true);
    }

    private void initFrame() {
        setSize(FrameConstant.WIDTH, FrameConstant.HEIGHT);
        setTitle(FrameConstant.GAME_TITLE);
        setLocation(FrameConstant.COORDINATE_X, FrameConstant.COORDINATE_Y);
        setResizable(false);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
