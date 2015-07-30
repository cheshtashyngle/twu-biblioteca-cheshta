package com.twu.biblioteca;

import java.util.ArrayList;


public class ListBooks {
    private Library library;
    private View view;

    public ListBooks(Library library, View view) {
        this.library = library;
        this.view = view;
    }

    public void execute() {
        ArrayList<String[]> books =library.books();
        String booksDetails = "";
        for(int bookNo = 0; bookNo < books.size();bookNo++) {
            String bookDetail = "";
            for(int bookAttribute = 0; bookAttribute < 3;bookAttribute++) {
                bookDetail = bookDetail + books.get(bookNo)[bookAttribute] + "\t|";
            }
            booksDetails = booksDetails + bookDetail + "\n";
        }
        view.print(booksDetails);
    }
}
