package com.kingyuluk.flappybird.component;

import com.kingyuluk.flappybird.constant.FrameConstant;
import com.kingyuluk.flappybird.util.NumberUtils;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class Background implements IComponentDraw {
    private BackgroundBottom bottom;
    private LinkedList<Cloud> clouds;
    private long beforeTime;

    public Background() {
        bottom = new BackgroundBottom();
        clouds = new LinkedList<>();
        beforeTime = System.currentTimeMillis();
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(FrameConstant.BG_COLOR);
        g.fillRect(0, 0, FrameConstant.WIDTH, FrameConstant.HEIGHT);
        bottom.draw(g);
        cloudsDraw(g);
    }
    private void cloudsDraw(Graphics g) {
        Iterator<Cloud> iterator = clouds.iterator();
        while (iterator.hasNext()) {
            Cloud cloud = iterator.next();
            cloud.draw(g);
            if (cloud.rightX() < 0) {
                iterator.remove();
            }
        }
        if (beforeTime + FrameConstant.CLOUD_INTERVAL > System.currentTimeMillis()) {
            return;
        }
        beforeTime = System.currentTimeMillis();
        if (clouds.size() < FrameConstant.MAX_CLOUD_COUNT && NumberUtils.probabilityOccurrence(FrameConstant.CLOUD_BORN_PERCENT, 100)) {
            int x = FrameConstant.WIDTH;
            //noinspection SuspiciousNameCombination
            int y = NumberUtils.randomRange(FrameConstant.TOP_BAR_HEIGHT, FrameConstant.HEIGHT / 3);
            Cloud cloud = new Cloud(x, y);
            cloud.draw(g);
            clouds.addLast(cloud);
        }
    }
}
