package com.kingyuluk.flappybird.constant;

import java.awt.*;

/**
 * WindowsConstant
 *
 * @author xuzhuo
 * 2020/8/1
 */
public class FrameConstant {
    //窗口
    public static final Integer WIDTH = 420;
    public static final Integer HEIGHT = 640;
    public static final String GAME_TITLE = "Flappy Bird written by Kingyu";
    //位置
    public static final Integer COORDINATE_X = 600;
    public static final Integer COORDINATE_Y = 100;
    //背景
    public static final Color BG_COLOR = new Color(0x4bc4cf);
    //刷新率
    public static final Integer GAME_INTERVAL = 1000 / 60;
    //标题栏高度
    public static final int TOP_BAR_HEIGHT = 20;
    //地面高度
    public static final Integer GROUND_HEIGHT = 35;
    //云最大数量
    public static final Integer MAX_CLOUD_COUNT = 7;
    //云计算周期 ms
    public static final Integer CLOUD_INTERVAL = 100;
    //云生成概率 %
    public static final Integer CLOUD_BORN_PERCENT = 6;
}
