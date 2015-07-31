package com.twu.biblioteca;

import java.util.ArrayList;


public class ListBooks implements Command{
    private Library library;
    private View view;

    public ListBooks(Library library, View view) {
        this.library = library;
        this.view = view;
    }

    public void execute() {
        ArrayList<Book> books =library.books();
        String booksDetails = "";
        for(int bookNo = 0; bookNo < books.size();bookNo++) {
            String bookDetail = books.get(bookNo).toString();
            booksDetails = booksDetails + bookDetail + "\n";
        }
        view.print(booksDetails);
    }
}
