package com.luxoft.effectivejava.exercise4;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Change ImmutableUser to be immutable.
 */
public class ImmutableUserTest {

    @Test
    public void shouldNotChangeInternalStateOfImmutableUser() {
        // given
        ImmutableUser user = new ImmutableUser("robert", new String[]{"Bob", "Rob", "R"});

        // when
        user.getLogin()[0] = 'b';
        user.getAliases()[1] = "Rek";

        // then
        assertArrayEquals("robert".toCharArray(), user.getLogin());
        assertArrayEquals(new String[]{"Bob", "Rob", "R"}, user.getAliases());
    }
}