package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.Authenticator;
import com.twu.biblioteca.model.User;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class LoginTest {

    @Test
    public void shouldTellAuthenticateToAuthenticateTheUser() {
        Console console = mock(Console.class);
        Authenticator authenticator = mock(Authenticator.class);
        MenuView menuview = mock(MenuView.class);
        LoginMenuView loginMenuView = mock(LoginMenuView.class);
        Login login = new Login(console, authenticator, menuview, loginMenuView);
        User user = new User("000-2015", "000-2015", "Student1", "student@gmail.com", "1234567890", false);

        when(console.input()).thenReturn("000-2015");
        when(authenticator.authenticate("000-2015", "000-2015")).thenReturn(user);
        login.performAction(null);

        verify(console).print("Enter your Library Number\n");
        verify(console).print("Enter your password\n");
        verify(console).print("Login successful\n");
        verify(menuview).performAction(user);
    }
}
