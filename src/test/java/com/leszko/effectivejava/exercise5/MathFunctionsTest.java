package com.leszko.effectivejava.exercise5;

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
        String positive = "0000120";

        String negative = "-" + positive;

        // when
        String resultFromNegative = MathFunctions.absString(Integer.valueOf(negative));

        // then
        assertEquals(removeLeadingZeros(positive), resultFromNegative);
    }

    private static String removeLeadingZeros(String number) {
        String result = number.replaceAll("^0+", "");
        if (result.isEmpty()) {
            return number;
        }
        return result;
    }
}