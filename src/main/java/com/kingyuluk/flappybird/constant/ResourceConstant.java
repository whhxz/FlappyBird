package com.kingyuluk.flappybird.constant;

import java.util.Objects;

public class ResourceConstant {
    private static final String BASE_PATH = Objects.requireNonNull(Constant.class.getClassLoader().getResource(".")).getPath();

    public static class Image {
        public static final String BG_BOTTOM = BASE_PATH + "img/background.png";

        public static final String[] CLOUDS = {
                BASE_PATH + "img/cloud_0.png",
                BASE_PATH + "img/cloud_1.png",
        };

        public static final String[] BIRD_NORMALS = {
                BASE_PATH + "img/0.png",
                BASE_PATH + "img/1.png",
                BASE_PATH + "img/2.png",
                BASE_PATH + "img/3.png",
                BASE_PATH + "img/4.png",
                BASE_PATH + "img/5.png",
                BASE_PATH + "img/6.png",
                BASE_PATH + "img/7.png"
        };
        public static final String BIRD_UP = BASE_PATH + "img/up.png";

        public static final String[] BIRD_DOWN = {
                BASE_PATH + "img/down_0.png",
                BASE_PATH + "img/down_1.png",
                BASE_PATH + "img/down_2.png",
                BASE_PATH + "img/down_3.png",
                BASE_PATH + "img/down_4.png",
                BASE_PATH + "img/down_5.png",
                BASE_PATH + "img/down_6.png",
                BASE_PATH + "img/down_7.png"
        };

        public static final String BIRD_DEAD = BASE_PATH + "img/dead.png";
    }

}
