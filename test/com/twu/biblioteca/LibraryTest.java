package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class LibraryTest {

    @Test
    public void shouldReturnTheBooks() {
        ArrayList<Book> books = new ArrayList<Book>();
        Book book1 = new Book("Head First With Java", "Serran", "1990");
        books.add(book1);
        Library library = new Library(books);

        assertEquals(books, library.books());
    }

    @Test
    public void shouldCheckoutBookIfAvailable() {
        ArrayList<Book> books1 = new ArrayList<Book>();
        Book book1 = new Book("Head First With Java", "Serran", "1990");
        Book book2 = new Book("Two States", "Chetan Bhagat", "2000");
        books1.add(book1);
        books1.add(book2);
        Library library = new Library(books1);
        ArrayList<Book> books2 = new ArrayList<Book>();
        books2.add(book1);

        library.checkout(book2);

        assertEquals(books2 , library.books());
    }


}
