package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class ListBooksTest {

    @Test
    public void shouldTellLibraryToTellWhatBooksIsHasAndAskViewToPrint() {
        Library library = mock(Library.class);
        View view = mock(View.class);
        ListBooks listBooks = new ListBooks(library, view);

        when(library.books()).thenReturn(new ArrayList<Book>());
        listBooks.execute();

        verify(view).print("");
    }

    @Test
    public void shouldCheckoutBookIfAvailable() {
        ArrayList<Book> books = new ArrayList<Book>();
        Book book1 = new Book("Head First With Java", "Serran", "1990");
        Book book2 = new Book("Two States", "Chetan Bhagat", "2000");
        books.add(book1);
        books.add(book2);
        Library library = new Library(books);

        library.checkout(book1);
        books.remove(book1);

        assertEquals(books, library.books());
    }
}
