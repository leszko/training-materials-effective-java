package com.luxoft.effectivejava.exercise5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 1. Write unit test to break MathFunctions.absString().
 * 2. Add check parameter for validity.
 */
public class MathFunctionsTest {

    @Test
    public void shouldReturnCorrectValue() {
        // TODO: change positive variable to break assertion and not cause NumberFormatException

        // given
        String positive = "10";

        String negative = "-" + positive;

        // when
        String resultFromNegative = MathFunctions.absString(Integer.valueOf(negative));

        // then
        assertEquals(positive, resultFromNegative);
    }
}