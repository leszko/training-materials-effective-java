package com.leszko.effectivejava.exercise1plus;

import java.util.HashSet;
import java.util.Set;

/**
 * Change the class to fix the UserPerformanceTest.
 */
public class User {
    private final Set<String> permutations;

    private User(String name) {
        permutations = new HashSet<>(PermutationsUtil.performPermutations(name));
    }

    public static User create(String name) {
        return new User(name);
    }

    public boolean isPermutationOf(String string) {
        return permutations.contains(string);
    }
}
