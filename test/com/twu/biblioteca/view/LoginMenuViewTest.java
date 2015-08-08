package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.parser.Parser;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class LoginMenuViewTest {

    @Test
    public void shouldDisplayLoginMenu() {
        Console console = mock(Console.class);
        Parser parser = mock(Parser.class);
        LoginMenuView loginMenuView = new LoginMenuView(console);
        Login login = mock(Login.class);

        when(console.input()).thenReturn("Login");
        when(parser.parseCommand("Login")).thenReturn(login);
        loginMenuView.setParser(parser);
        loginMenuView.performAction(null);

        String[] menu = {"Login", "Quit"};
        for(String menuElement : menu) {
            verify(console).print(menuElement);
        }
        verify(console, times(2)).print("\n");
        verify(parser).parseCommand("Login");
        verify(login).performAction(null);
    }
}