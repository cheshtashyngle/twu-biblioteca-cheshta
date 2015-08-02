package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class CheckoutBookTest {

    @Test
    public void shouldTellLibraryToTellWhatBooksIsHasAndAskViewToPrint() {
        Library library = mock(Library.class);
        View view = mock(View.class);
        CheckoutBook checkoutBook = new CheckoutBook(library, view, "Head First With Java");

        checkoutBook.execute();

        verify(library).checkoutBook("Head First With Java");
    }
}
