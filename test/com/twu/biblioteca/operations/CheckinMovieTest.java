package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.operations.CheckinMovie;
import com.twu.biblioteca.view.View;
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
