package com.twu.biblioteca;


import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ListOfBooksFormatterTest {

    @Test
    public void shouldReturnTheListOfBooks() {
        ArrayList books = new ArrayList();
        books.add("Head First With Java");
        Formatter listOfBooksFormatter = new ListOfBooksFormatter(books);

        assertEquals("Head First With Java\n", listOfBooksFormatter.format());
    }
}
