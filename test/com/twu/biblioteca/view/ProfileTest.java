package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.User;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ProfileTest {

    @Test
    public void shouldDisplayUserDetails() {
        Console console = mock(Console.class);
        MenuView menuView = mock(MenuView.class);
        Profile profile = new Profile(console, menuView);
        User user = new User("000-2015", "000-2015", "Student1", "student@gmail.com", "1234567890", false);

        profile.performAction(user);

        verify(console).print(user.toString());
        verify(menuView).performAction(user);
    }

}
