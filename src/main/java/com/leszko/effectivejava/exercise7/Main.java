package com.leszko.effectivejava.exercise7;

/**
 * 1. Notice: if you decide that Dog should not throw the exception, you have to change the whole hierarchy (OCP broken)
 * 2. Change TooManyBarksException to the unchecked exception and remove throws declarations.
 */
public class Main {

    public static void main(String[] args) {
        City city = new City();
        try {
            city.playLife();
        } catch (TooManyBarksException e) {
            e.printStackTrace();
        }
    }
}
