package com.twu.biblioteca.controller;

import com.twu.biblioteca.parser.Parser;
import com.twu.biblioteca.view.ListBooks;
import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.view.View;
import com.twu.biblioteca.view.WelcomeView;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class BibliotecaAppTest {

    @Test
    public void runShouldCallMethods() {
        WelcomeView welcomeView = mock(WelcomeView.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(welcomeView);

        bibliotecaApp.run();

        verify(welcomeView).performAction();
    }
}
