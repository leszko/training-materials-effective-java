package com.leszko.effectivejava.exercise1plus;

import org.junit.Test;

/**
 * Make the test pass.
 */
public class UserPerformanceTest {

    @Test(timeout = 10_000)
    public void shouldCreateManySameUserInShortTime() {
        // given
        String name = "Robert";
        int times = 1_000_000;
        User [] users = new User[times];

        // when
        for (int i = 0; i < times; i++) {
            users[i] = new User(name);
        }
    }

}