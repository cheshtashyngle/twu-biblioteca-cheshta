package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class WelcomeViewTest {

    @Test
    public void shouldDisplayWelcomeAndShouldCallNextView() {
        View menuView = mock(MenuView.class);
        Console console = mock(Console.class);
        WelcomeView welcomeView = new WelcomeView(console, menuView);

        welcomeView.performAction(null);

        verify(console).print("Welcome to Biblioteca Library Management System\n");
        verify(menuView).performAction(null);
    }
}
