package com.leszko.effectivejava.exercise1;

/**
 * Change constructor to static factory method.
 */
public class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
