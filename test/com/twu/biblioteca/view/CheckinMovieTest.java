package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.User;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class CheckinMovieTest {

    @Test
    public void shouldTellLibraryToPerformCheckin() {
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        View menuView = mock(MenuView.class);
        CheckinMovie checkinMovie = new CheckinMovie(library, console, menuView);
        User user = new User("000-2015", "000-2015", "Student1", "student@gmail.com", "1234567890", false);

        when(console.input()).thenReturn("ABCD2");
        when(library.checkinMovie("ABCD2", user)).thenReturn(true);
        checkinMovie.performAction(user);

        verify(console).print("Enter the movie name\n");
        verify(console).print("Thank you for returning the Movie\n");
        verify(menuView).performAction(user);
    }
}
