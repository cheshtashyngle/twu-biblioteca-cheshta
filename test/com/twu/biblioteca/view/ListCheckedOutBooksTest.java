package com.twu.biblioteca.view;

import org.junit.Test;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.console.Console;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ListCheckedOutBooksTest {

    @Test
    public void shouldTellLibraryToTellWhatCheckedOutBooksItHasAndAskViewToPrint() {
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        View menuView = mock(MenuView.class);
        ListCheckOutBooks listCheckOutBooks = new ListCheckOutBooks(library, console, menuView);

        listCheckOutBooks.performAction();

        verify(console).print(library.books());
        verify(menuView).performAction();
    }
}
