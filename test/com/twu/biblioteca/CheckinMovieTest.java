package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CheckinMovieTest {

    @Test
    public void shouldTellLibraryToPerformCheckin() {
        Library library = mock(Library.class);
        View view = mock(View.class);
        CheckinMovie checkinMovie = new CheckinMovie(library, view, "ABCD2");

        checkinMovie.execute();

        verify(library).checkinMovie("ABCD2");
    }
}
