package com.luxoft.effectivejava.exercise7;

import java.util.ArrayList;
import java.util.List;

public class City {
    private final List<Person> people = new ArrayList<>();

    public void playLife() throws TooManyBarksException {
        for (Person person : people) {
            person.walkYouDogs();
        }
    }

}
