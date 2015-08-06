package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class LoginViewTest {

    @Test
    public void shouldDisplayLoginMenu() {
        Console console = mock(Console.class);
        LoginView loginView = new LoginView(console);

        loginView.performAction();

        String[] menu = {"Login", "Quit"};
        for(String menuElement : menu) {
            verify(console).print(menuElement);
        }
        verify(console, times(2)).print("\n");
    }
}
