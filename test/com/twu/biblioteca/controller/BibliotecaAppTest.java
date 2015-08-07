package com.twu.biblioteca.controller;

import com.twu.biblioteca.view.WelcomeView;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaAppTest {

    @Test
    public void runShouldCallMethods() {
        WelcomeView welcomeView = mock(WelcomeView.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(welcomeView);

        bibliotecaApp.run();

        verify(welcomeView).performAction();
    }
}
