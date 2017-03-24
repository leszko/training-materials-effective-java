package com.leszko.effectivejava.exercise6;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * After refactoring the test should still pass.
 */
@RunWith(MockitoJUnitRunner.class)
public class NullRandomizerTest {
    private static final Integer RANDOM_INT = 16;
    private static final Double RANDOM_DOUBLE = 14.6;

    @Mock
    private Random random;

    @InjectMocks
    private NullRandomizer nullRandomizer;

    @Before
    public void setUp() {
        when(random.nextInt()).thenReturn(RANDOM_INT);
        when(random.nextDouble()).thenReturn(RANDOM_DOUBLE);
    }

    @Test
    public void shouldRandomIntegerIfNull() {
        // given
        Integer n = null;

        // when
        Integer result = nullRandomizer.randomizeIntegerIfNull(n);

        // then
        assertEquals(RANDOM_INT, result);
    }

    @Test
    public void shouldReturnSameIntegerIfNotNull() {
        // given
        Integer n = 30;

        // when
        Integer result = nullRandomizer.randomizeIntegerIfNull(n);

        // then
        assertEquals(n, result);
    }

    @Test
    public void shouldRandomDoubleIfNull() {
        // given
        Double n = null;

        // when
        Double result = nullRandomizer.randomizeDoubleIfNull(n);

        // then
        assertEquals(RANDOM_DOUBLE, result);
    }

    @Test
    public void shouldReturnSameDoubleIfNotNull() {
        // given
        Double n = 37.32;

        // when
        Double result = nullRandomizer.randomizeDoubleIfNull(n);

        // then
        assertEquals(n, result);
    }
}