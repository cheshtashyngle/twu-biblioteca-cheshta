package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.console.Console;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CheckinBookTest {

    @Test
    public void shouldTellLibraryToPerformCheckin() {
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        CheckinBook checkinBook = new CheckinBook(library, console, "Head First With Java");

        checkinBook.execute();

        verify(library).checkinBook("Head First With Java");
    }
}
