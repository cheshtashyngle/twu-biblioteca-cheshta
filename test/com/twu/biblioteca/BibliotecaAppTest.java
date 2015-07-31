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
        ArrayList<String> menu = new ArrayList<String>();
        BibliotecaApp bibliotecaApp = new BibliotecaApp(view, parser, menu);
        menu.add("ListBooks");
        menu.add("Quit");
        String menuString = "Menu\n";
        for(int menuElement =0;menuElement < menu.size();menuElement++) {
            menuString = menuString + (menuElement+1) + "." + menu.get(menuElement) + "\n";
        }

        when(view.input()).thenReturn("ListBooks");
        when(parser.parseCommand("ListBooks")).thenReturn(listBooks);
        bibliotecaApp.run();

        verify(view).print("Welcome to Biblioteca Library Management System\n");
        verify(view).print(menuString);
        verify(view).input();
        verify(parser).parseCommand("ListBooks");
        verify(listBooks).execute();
    }
}
