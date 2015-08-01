package com.luxoft.effectivejava.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Change constructor to static factory method.
 */
public class UserTest {
    @Test
    public void userShouldBeCreated() {
        // given
        String name = "Robert";

        // when
        User user = new User(name);

        // then
        assertEquals(name, user.getName());
    }
}