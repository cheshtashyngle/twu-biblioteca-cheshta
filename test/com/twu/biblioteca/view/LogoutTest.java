package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LogoutTest {

    @Test
    public void shouldDisplayMessageAndCallNextView() {
        Console console = mock(Console.class);
        LoginMenuView loginMenuView = mock(LoginMenuView.class);
        Logout logout = new Logout(console, loginMenuView);

        logout.performAction();

        verify(console).print("Logout Successful\n");
        verify(loginMenuView).performAction();
    }
}
