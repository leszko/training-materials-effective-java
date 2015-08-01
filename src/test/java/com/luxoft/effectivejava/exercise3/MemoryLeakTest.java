package com.luxoft.effectivejava.exercise3;

import org.junit.Test;

/**
 * Change the MemoryLeak class to fix the unit test.
 */
public class MemoryLeakTest {

    @Test(expected = OutOfMemoryError.class)
    public void shouldThrowOutOfMemoryError() {
        // given
        MemoryLeak memoryLeak = new MemoryLeak();

        // when
        memoryLeak.foo();

        // then
        // exception expected
    }

}