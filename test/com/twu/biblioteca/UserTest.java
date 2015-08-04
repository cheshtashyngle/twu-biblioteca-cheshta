package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void shouldReturnTrueIfLoginDetailsMatch() {
        User user = new User("001-2015", "hello");

        assertEquals(true, user.login("001-2015", "hello"));
    }
}
