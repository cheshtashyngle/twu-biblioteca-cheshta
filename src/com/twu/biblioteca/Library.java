package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<String[]> books;

    public Library(ArrayList<String[]> books) {
        this.books = books;
    }

    public ArrayList<String[]> books() {
        return books;
    }

    public void checkout(String[] book1) {
        //books.remove(book1);
    }

    @Override
    public int hashCode() {
        return books != null ? books.hashCode() : 0;
    }
}