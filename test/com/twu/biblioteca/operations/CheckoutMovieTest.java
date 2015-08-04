package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.operations.CheckoutMovie;
import com.twu.biblioteca.view.View;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CheckoutMovieTest {

    @Test
    public void shouldTellLibraryToPerformCheckout() {
        Library library = mock(Library.class);
        View view = mock(View.class);
        CheckoutMovie checkoutMovie = new CheckoutMovie(library, view, "ABCD2");

        checkoutMovie.execute();

        verify(library).checkoutMovie("ABCD2");
    }
}
