package com.luxoft.effectivejava.exercise5;

/**
 * 1. Write a unit test to break this function.
 * 2. Add check parameter for validity.
 */
public class MathFunctions {
    public static int abs(int n) {
        if (n < 0) {
            return -n;
        }
        return n;
    }
}
