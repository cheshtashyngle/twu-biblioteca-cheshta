package com.twu.biblioteca;

import java.util.ArrayList;


public class ListOfBooksFormatter implements Formatter {
    private ArrayList<String[]> books;

    public ListOfBooksFormatter(ArrayList books) {
        this.books = books;
    }

    @Override
    public String format() {
        String booksDetails = "";
        for(int bookNo = 0; bookNo < books.size();bookNo++) {
            String bookDetail = "";
            for(int bookAttribute = 0; bookAttribute < 3;bookAttribute++) {
                bookDetail = bookDetail + books.get(bookNo)[bookAttribute] + "\t|";
            }
            booksDetails = booksDetails + bookDetail + "\n";
        }
        return booksDetails;
    }
}
