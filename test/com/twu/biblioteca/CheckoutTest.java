package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class CheckoutTest {

    @Test
    public void shouldTellLibraryToTellWhatBooksIsHasAndAskViewToPrint() {
        Library library = mock(Library.class);
        View view = mock(View.class);
        Checkout checkout = new Checkout(library, view, "Head First With Java");

        checkout.execute();

        verify(library).checkout("Head First With Java");
    }
}
