package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class    BookTest {

    @Test
    public void twoBooksAreSameIfThereNamesAreSame() {
        Book book1 = new Book("Head First Java", "Serran", "1990");
        Book book2 = new Book("Head First Java", "Serran", "1990");

        assertEquals(book1, book2);
    }

    @Test
    public void twoBooksAreNotSameIfThereNamesAreNotSame() {
        Book book1 = new Book("Head First Java1", "Serran", "1990");
        Book book2 = new Book("Head First Java2", "Serran", "1990");

        assertNotEquals(book1, book2);
    }
}