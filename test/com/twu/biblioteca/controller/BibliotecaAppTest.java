package com.twu.biblioteca.controller;

import com.twu.biblioteca.parser.Parser;
import com.twu.biblioteca.menu.Menu;
import com.twu.biblioteca.operations.Command;
import com.twu.biblioteca.operations.ListBooks;
import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.view.MenuView;
import com.twu.biblioteca.view.WelcomeView;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class BibliotecaAppTest {

    @Test
    public void runShouldCallMethods() {
        Console console = mock(Console.class);
        Parser parser = mock(Parser.class);
        Command listBooks = mock(ListBooks.class);
        Menu menu = new Menu();
        WelcomeView welcomeView = mock(WelcomeView.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(console, parser, menu, welcomeView);

        when(console.input()).thenReturn("ListBooks");
        when(parser.parseCommand("ListBooks")).thenReturn(listBooks);
        bibliotecaApp.run();

        verify(console).print("Welcome to Biblioteca Library Management System\n");
        verify(console).print(menu.toString());
        verify(console).input();
        verify(parser).parseCommand("ListBooks");
        verify(listBooks).execute();
    }
}
