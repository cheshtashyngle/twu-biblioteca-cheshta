package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.console.Console;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class ListBooksTest {

    @Test
    public void shouldTellLibraryToTellWhatBooksItHasAndAskViewToPrint() {
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        View menuView = mock(MenuView.class);
        ListBooks listBooks = new ListBooks(library, console, menuView);

        listBooks.performAction();

        verify(console).print(library.books());
        verify(menuView).performAction();
    }
}
