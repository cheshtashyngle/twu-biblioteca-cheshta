package com.twu.biblioteca.model;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Item;
import com.twu.biblioteca.model.Section;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class SectionTest {

    @Test
    public void shouldReturnTheBooks() {
        ArrayList<Item> books = new ArrayList<Item>();
        Book book1 = new Book("Head First With Java", "Serran", "1990");
        books.add(book1);
        Section section = new Section(books);

        assertEquals(books, section.items());
    }

    @Test
    public void shouldCheckoutBookIfAvailable() {
        ArrayList<Item> books1 = new ArrayList<Item>();
        Book book1 = new Book("Head First With Java", "Serran", "1990");
        Book book2 = new Book("Two States", "Chetan Bhagat", "2000");
        books1.add(book1);
        books1.add(book2);
        Section section = new Section(books1);
        ArrayList<Book> books2 = new ArrayList<Book>();
        books2.add(book1);

        section.checkout(book2.name());

        assertEquals(books2 , section.items());
    }

    @Test
    public void shouldCheckinBookIfIssued() {
        ArrayList<Item> books1 = new ArrayList<Item>();
        Book book1 = new Book("Head First With Java", "Serran", "1990");
        Book book2 = new Book("Two States", "Chetan Bhagat", "2000");
        books1.add(book1);
        books1.add(book2);
        Section section = new Section(books1);
        ArrayList<Book> books2 = new ArrayList<Book>();
        books2.add(book1);
        books2.add(book2);

        section.checkout(book2.name());
        section.checkin(book2.name());

        assertEquals(books2, section.items());
    }
}