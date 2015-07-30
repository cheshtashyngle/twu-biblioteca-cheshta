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
}