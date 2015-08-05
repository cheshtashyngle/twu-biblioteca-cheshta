package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.Item;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.console.Console;
import org.junit.Test;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class ListMoviesTest {

    @Test
    public void shouldTellLibraryToTellWhatMoviesItHasAndAskViewToPrint() {
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        ListBooks listBooks = new ListBooks(library, console);

        when(library.movies()).thenReturn(new ArrayList<Item>());
        listBooks.execute();

        verify(console).print("");
    }
}

