package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.parser.Parser;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class MenuViewTest {

    @Test
    public void shouldDisplayMenuAndShouldCallNextView() {
        Console console = mock(Console.class);
        MenuView menuView = new MenuView(console);
        Parser parser = mock(Parser.class);
        View listBooks = mock(ListBooks.class);

        menuView.setParser(parser);
        when(console.input()).thenReturn("ListBooks");
        when(parser.parseCommand(anyString())).thenReturn(listBooks);
        menuView.performAction();

        String[] menu = {"ListBooks", "ListCheckedOutBooks", "ListMovies", "ListCheckedOutMovies", "CheckoutBook", "CheckinBook", "CheckoutMovie", "CheckinMovie",  "Quit"};
        for (String menuElement : menu) {
           verify(console).print(menuElement);
        }
        verify(console, times(9)).print("\n");
        verify(parser).parseCommand("ListBooks");
    }
}