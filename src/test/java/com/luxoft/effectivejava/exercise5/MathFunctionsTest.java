package com.luxoft.effectivejava.exercise5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 1. Write unit test to break MathFunctions.abs().
 * 2. Add check parameter for validity.
 */
public class MathFunctionsTest {

    @Test
    public void shouldFail() {
        // TODO: make this test fail

        // given
        int n = -10;

        // when
        int result = MathFunctions.abs(n);

        // then
        assertEquals(-n, result);
    }
}