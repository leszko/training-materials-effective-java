package com.leszko.effectivejava.exercise6;

import java.util.Random;

public class NullRandomizer {

    private final Random random;

    public NullRandomizer(Random random) {
        this.random = random;
    }


    public Integer randomizeIntegerIfNull(Integer n) {
        if (n == null) {
            return random.nextInt();
        }
        return n;
    }

    public Double randomizeDoubleIfNull(Double n) {
        if (n == null) {
            return random.nextDouble();
        }
        return n;
    }
}
