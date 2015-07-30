package com.twu.biblioteca;

import java.util.ArrayList;

public class ListOfBooksFormatter implements Formatter {
    private ArrayList books;

    public ListOfBooksFormatter(ArrayList books) {
        this.books = books;
    }

    @Override
    public String format() {
        String output = "";
        for(int i = 0;i < books.size();i ++) {
            output = output + books.get(i) + "\n";
        }
        return output;
    }
}
