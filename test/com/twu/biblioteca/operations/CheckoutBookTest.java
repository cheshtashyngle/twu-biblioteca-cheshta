package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.console.Console;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class CheckoutBookTest {

    @Test
    public void shouldTellLibraryToPerformCheckout() {
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        CheckoutBook checkoutBook = new CheckoutBook(library, console, "Head First With Java");

        checkoutBook.execute();

        verify(library).checkoutBook("Head First With Java");
    }
}
