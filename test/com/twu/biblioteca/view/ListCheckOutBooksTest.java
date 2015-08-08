package com.twu.biblioteca.view;

import org.junit.Test;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.console.Console;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ListCheckOutBooksTest {

    @Test
    public void shouldTellLibraryToTellWhatCheckedOutBooksItHasAndAskViewToPrint() {
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        View menuView = mock(MenuView.class);
        Login login = mock(Login.class);
        ListCheckOutBooks listCheckOutBooks = new ListCheckOutBooks(library, console, menuView, login);

        listCheckOutBooks.performAction();

        verify(console).print(library.books());
        verify(menuView).performAction();
    }
}