package com.kingyuluk.flappybird.util;

import java.util.Random;

public class NumberUtils {
    public static int randomRange(int left, int right) {
        return new Random().nextInt(right - left) + left;
    }

    public static boolean probabilityOccurrence(int numerator, int denominator) {
        if (numerator <= 0 || denominator <= 0) {
            throw new IllegalArgumentException("0参数错误，不能小于0");
        }
        if (numerator >= denominator) {
            return true;
        }
        return randomRange(0, denominator) < numerator;
    }

    public static void main(String[] args) {
        int total = 1000000;
        int num = 0;
        for (int i = 0; i < total; i++) {
            if (probabilityOccurrence(6, 100)) {
                num++;
            }

        }
        System.out.println(num / (total * 1.0));
    }
}
