package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.console.Console;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class ListMoviesTest {

    @Test
    public void shouldTellLibraryToTellWhatMoviesItHasAndAskViewToPrint() {
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        View menuView = mock(MenuView.class);
        ListMovies listMovies = new ListMovies(library, console, menuView);

        listMovies.performAction(null);

        verify(console).print(library.movies());
        verify(menuView).performAction(null);
    }
}

