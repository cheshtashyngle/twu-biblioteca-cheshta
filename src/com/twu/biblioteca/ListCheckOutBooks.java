package com.twu.biblioteca;

import java.util.ArrayList;

public class ListCheckOutBooks implements Command {
    private Library library;
    private View view;

    public ListCheckOutBooks(Library library, View view) {
        this.library = library;
        this.view = view;
    }

    @Override
    public void execute() {
        ArrayList<Item> checkedOutBooks =library.checkedOutBooks();
        String booksDetails = "";
        for(int bookNo = 0; bookNo < checkedOutBooks.size();bookNo++) {
            String bookDetail = checkedOutBooks.get(bookNo).toString();
            booksDetails = booksDetails + bookDetail + "\n";
        }
        view.print(booksDetails);
    }
}
