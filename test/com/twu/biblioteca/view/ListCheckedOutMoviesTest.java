package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.console.Console;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ListCheckedOutMoviesTest {

    @Test
    public void shouldTellLibraryToTellWhatCheckedOutBooksItHasAndAskViewToPrint() {
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        View menuView = mock(MenuView.class);
        ListCheckOutMovies listCheckOutMovies = new ListCheckOutMovies(library, console, menuView);

        listCheckOutMovies.performAction();

        verify(console).print(library.books());
        verify(menuView).performAction();
    }
}
