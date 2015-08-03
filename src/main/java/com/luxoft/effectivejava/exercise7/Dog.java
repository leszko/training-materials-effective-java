package com.luxoft.effectivejava.exercise7;

public class Dog {
    private static final int BARK_LIMIT = 100;
    private int barkCounter = 0;

    public void bark() throws TooManyBarksException {
        if (barkCounter > BARK_LIMIT) {
            throw new TooManyBarksException();
        }

        System.out.println("Wow wow");
        barkCounter++;
    }
}
