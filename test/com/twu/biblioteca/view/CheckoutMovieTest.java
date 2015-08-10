package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.User;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class CheckoutMovieTest {

    @Test
    public void shouldTellLibraryToPerformCheckout() {
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        View menuView = mock(MenuView.class);
        CheckoutMovie checkoutMovie = new CheckoutMovie(library, console, menuView);
        User user = new User("000-2015", "000-2015", "Student1", "student@gmail.com", "1234567890", false);

        when(console.input()).thenReturn("ABCD2");
        when(library.checkoutMovie("ABCD2", user)).thenReturn(true);
        checkoutMovie.performAction(user);

        verify(console).print("Enter the movie name\n");
        verify(console).print("Thank you! Enjoy the movie\n");
        verify(menuView).performAction(user);
    }
}
