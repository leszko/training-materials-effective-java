package com.luxoft.effectivejava.exercise7;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final List<Dog> dogs = new ArrayList<>();

    public void walkYouDogs() throws TooManyBarksException {
        for (Dog dog : dogs) {
            dog.bark();
        }
    }
}
