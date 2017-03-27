package com.leszko.effectivejava.exercise5;

import org.junit.Test;

/**
 * Add a Precondition check and make the test pass.
 */
public class MathFunctionsTest {

    @Test(expected = NullPointerException.class)
    public void shouldThrowExceptionWhenNullIsPassed() {
        // given
        Long n = null;

        // when & then
        String result = MathFunctions.toString(n);
    }
}