package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.console.Console;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CheckoutMovieTest {

    @Test
    public void shouldTellLibraryToPerformCheckout() {
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        CheckoutMovie checkoutMovie = new CheckoutMovie(library, console, "ABCD2");

        checkoutMovie.execute();

        verify(library).checkoutMovie("ABCD2");
    }
}
