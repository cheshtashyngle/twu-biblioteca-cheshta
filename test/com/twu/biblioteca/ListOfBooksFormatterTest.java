package com.twu.biblioteca;


import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ListOfBooksFormatterTest {

    @Test
    public void shouldReturnTheListOfBooks() {
        ArrayList books = new ArrayList();
        books.add("Head First With Java");
        books.add("C Sharp");
        Formatter listOfBooksFormatter = new ListOfBooksFormatter(books);

        assertEquals("Head First With Java\nC Sharp", listOfBooksFormatter.format());
    }
}
