package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.console.Console;
import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;


public class CheckoutBookTest {

    @Test
    public void shouldTellLibraryToPerformCheckout() {
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        View menuView = mock(MenuView.class);
        CheckoutBook checkoutBook = new CheckoutBook(library, console, menuView);

        when(library.checkoutBook(anyString())).thenReturn(true);
        checkoutBook.performAction();

        verify(console).print("Enter the book name\n");
        verify(console).print("Thank you! Enjoy the book\n");
        verify(menuView).performAction();
    }
}
