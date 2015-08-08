package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.User;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CheckinMovieTest {

    @Test
    public void shouldTellLibraryToPerformCheckin() {
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        View menuView = mock(MenuView.class);
        Login login = mock(Login.class);
        CheckinMovie checkinMovie = new CheckinMovie(library, console, menuView, login);
        User user = new User("000-2015", "000-2015", "customer");

        when(console.input()).thenReturn("ABCD2");
        when(login.getCurrentUser()).thenReturn(user);
        when(library.checkinMovie("ABCD2", user)).thenReturn(true);
        checkinMovie.performAction();

        verify(console).print("Enter the movie name\n");
        verify(console).print("Thank you for returning the Movie\n");
        verify(menuView).performAction();
    }
}
