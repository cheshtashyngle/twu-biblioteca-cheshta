package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ListOfBooksFormatterTest {

    @Test
    public void shouldReturnTheListOfBooks() {
        ArrayList<String[]> books = new ArrayList();
        String[] book = {"Head First With Java", "Serran", "1990"};
        books.add(book);
        Formatter listOfBooksFormatter = new ListOfBooksFormatter(books);

        assertEquals("Head First With Java\t|Serran\t|1990\t|\n", listOfBooksFormatter.format());
    }
}
