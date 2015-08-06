package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.Library;
import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CheckinMovieTest {

    @Test
    public void shouldTellLibraryToPerformCheckin() {
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        View menuView = mock(MenuView.class);
        CheckinMovie checkinMovie = new CheckinMovie(library, console, menuView);

        when(library.checkinMovie(anyString())).thenReturn(true);
        checkinMovie.performAction();

        verify(console).print("Enter the movie name\n");
        verify(console).print("Thank you for returning the Movie\n");
        verify(menuView).performAction();
    }
}
