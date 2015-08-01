package com.luxoft.effectivejava.exercise1;

import org.junit.Test;

/**
 * Exercise 1*: Make this test pass.
 */
public class UserPerformanceTest {
    @Test(timeout = 10000)
    public void shouldCreateManySameUserInShortTime() {
        // given
        String name = "Robert";
        long times = 1_000_000_000_000L;

        // when
        for (long i = 0; i < times; i++) {
            User user = new User(name);
        }
    }

}
