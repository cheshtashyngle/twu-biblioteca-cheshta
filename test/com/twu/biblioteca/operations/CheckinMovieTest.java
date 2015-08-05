package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.console.Console;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CheckinMovieTest {

    @Test
    public void shouldTellLibraryToPerformCheckin() {
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        CheckinMovie checkinMovie = new CheckinMovie(library, console, "ABCD2");

        checkinMovie.execute();

        verify(library).checkinMovie("ABCD2");
    }
}
