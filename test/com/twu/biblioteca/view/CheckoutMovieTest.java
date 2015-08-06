package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.console.Console;
import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CheckoutMovieTest {

    @Test
    public void shouldTellLibraryToPerformCheckout() {
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        View menuView = mock(MenuView.class);
        CheckoutMovie checkoutMovie = new CheckoutMovie(library, console, menuView);

        when(library.checkoutMovie(anyString())).thenReturn(true);
        checkoutMovie.performAction();

        verify(console).print("Enter the movie name\n");
        verify(console).print("Thank you! Enjoy the movie\n");
        verify(menuView).performAction();
    }
}
