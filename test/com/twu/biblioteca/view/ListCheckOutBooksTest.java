package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.Library;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ListCheckOutBooksTest {

    @Test
    public void shouldTellLibraryToTellWhatCheckedOutBooksItHasAndAskViewToPrint() {
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        View menuView = mock(MenuView.class);
        ListCheckOutBooks listCheckOutBooks = new ListCheckOutBooks(library, console, menuView);

        listCheckOutBooks.performAction(null);

        verify(console).print(library.books());
        verify(menuView).performAction(null);
    }
}
