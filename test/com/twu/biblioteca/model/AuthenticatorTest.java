package com.twu.biblioteca.model;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class AuthenticatorTest {

    @Test
    public void shouldAuthenticateUser() {
        ArrayList<User> users = new ArrayList<User>();
        User user = new User("000-2015", "000-2015", "Student1", "student@gmail.com", "1234567890", false);
        users.add(user);
        Authenticator authenticator = new Authenticator(users);

        assertEquals(User.class, authenticator.authenticate("000-2015", "student").getClass());
    }
}
