package com.leszko.effectivejava.exercise5;

import org.junit.Test;

/**
 * Add a Precondition check and make the test pass.
 */
public class LongFunctionsTest {

    @Test(expected = NullPointerException.class)
    public void shouldThrowExceptionWhenNullIsPassed() {
        // given
        Long n = null;

        // when & then
        String result = LongFunctions.toString(n);
    }
}