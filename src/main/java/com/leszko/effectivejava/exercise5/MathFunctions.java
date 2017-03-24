package com.leszko.effectivejava.exercise5;

/**
 * 1. Write a unit test to break this function.
 * 2. Add check parameter for validity.
 */
public class MathFunctions {
    public static String absString(int n) {
        if (n < 0) {
            return Integer.toString(-n);
        }
        return Integer.toString(n);
    }
}
