package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class LibraryTest {

    @Test
    public void shouldCallSectionListItemsForBooks() {
        Section book = mock(Section.class);
        Section movie = mock(Section.class);
        Library library = new Library(book, movie);

        library.books();

        verify(book).items();
    }

    @Test
    public void shouldCallSectionCheckoutForBook() {
        Section book = mock(Section.class);
        Section movie = mock(Section.class);
        Library library = new Library(book, movie);

        library.checkoutBook("Head First With Java");

        verify(book).checkout("Head First With Java");
    }

    @Test
    public void shouldCallSectionCheckinForBook() {
        Section book = mock(Section.class);
        Section movie = mock(Section.class);
        Library library = new Library(book, movie);

        library.checkinBook("Head First With Java");

        verify(book).checkin("Head First With Java");
    }

    @Test
    public void shouldCallSectionCheckoutForMovie() {
        Section book = mock(Section.class);
        Section movie = mock(Section.class);
        Library library = new Library(book, movie);

        library.checkoutMovie("Head First With Java");

        verify(movie).checkout("Head First With Java");
    }
}
