package com.luxoft.effectivejava.Demo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[]{1, 2, 3};

        int result = Arrays.stream(array).reduce(0, (a, b) -> a + b);
        System.out.println(result);
    }
}
