package com.luxoft.effectivejava.exercise1plus;

import java.util.HashSet;
import java.util.Set;

public class User {
    private final Set<String> permutations;

    public User(String name) {
        permutations = new HashSet<>(PermutationsUtil.performPermutations(name));
    }

    public boolean isPermutationOf(String string) {
        return permutations.contains(string);
    }
}
