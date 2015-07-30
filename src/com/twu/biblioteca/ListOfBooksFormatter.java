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
        int i;
        for(i = 0;i < (books.size() - 1);i++) {
            output = output + books.get(i) + "\n";
        }
        output += books.get(i);
        return output;
    }
}
