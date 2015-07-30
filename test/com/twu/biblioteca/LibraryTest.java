package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class LibraryTest {

    @Test
    public void shouldReturnTheBooks() {
        ArrayList<String[]> books = new ArrayList<String[]>();
        String[] book1 = {"Head First With Java", "Serran", "1990"};
        books.add(book1);
        Library library = new Library(books);

        assertEquals(books, library.books());
    }
}
