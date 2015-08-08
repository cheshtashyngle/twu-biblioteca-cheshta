package com.twu.biblioteca.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void shouldReturnTrueIfLoginDetailsMatch() {
        User user = new User("001-2015", "hello", false);

        assertEquals(true, user.hasLoginCredentials("001-2015", "hello"));
    }
}
