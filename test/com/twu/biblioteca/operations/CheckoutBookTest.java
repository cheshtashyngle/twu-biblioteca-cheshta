package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.operations.CheckoutBook;
import com.twu.biblioteca.view.View;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class CheckoutBookTest {

    @Test
    public void shouldTellLibraryToPerformCheckout() {
        Library library = mock(Library.class);
        View view = mock(View.class);
        CheckoutBook checkoutBook = new CheckoutBook(library, view, "Head First With Java");

        checkoutBook.execute();

        verify(library).checkoutBook("Head First With Java");
    }
}
