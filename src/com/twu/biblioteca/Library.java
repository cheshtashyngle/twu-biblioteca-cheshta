package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> books() {
        return books;
    }

    public void checkout(Book book1) {
        books.remove(book1);
    }

    @Override
    public int hashCode() {
        return books != null ? books.hashCode() : 0;
    }

}