package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

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
