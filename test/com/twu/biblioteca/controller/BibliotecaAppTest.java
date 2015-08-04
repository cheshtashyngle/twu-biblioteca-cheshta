package com.twu.biblioteca.controller;

import com.twu.biblioteca.parser.Parser;
import com.twu.biblioteca.controller.BibliotecaApp;
import com.twu.biblioteca.menu.Menu;
import com.twu.biblioteca.operations.Command;
import com.twu.biblioteca.operations.ListBooks;
import com.twu.biblioteca.view.View;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class BibliotecaAppTest {

    @Test
    public void runShouldCallMethods() {
        View view = mock(View.class);
        Parser parser = mock(Parser.class);
        Command listBooks = mock(ListBooks.class);
        Menu menu = new Menu();
        BibliotecaApp bibliotecaApp = new BibliotecaApp(view, parser, menu);

        when(view.input()).thenReturn("ListBooks");
        when(parser.parseCommand("ListBooks")).thenReturn(listBooks);
        bibliotecaApp.run();

        verify(view).print("Welcome to Biblioteca Library Management System\n");
        verify(view).print(menu.toString());
        verify(view).input();
        verify(parser).parseCommand("ListBooks");
        verify(listBooks).execute();
    }
}
