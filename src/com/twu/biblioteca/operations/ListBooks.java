package com.twu.biblioteca.operations;

import com.twu.biblioteca.view.View;
import com.twu.biblioteca.model.Item;
import com.twu.biblioteca.model.Library;

import java.util.ArrayList;


public class ListBooks implements Command {
    private Library library;
    private View view;

    public ListBooks(Library library, View view) {
        this.library = library;
        this.view = view;
    }

    public void execute() {
        ArrayList<Item> books =library.books();
        String booksDetails = "";
        for (Item book : books) {
            String bookDetail = book.toString();
            booksDetails = booksDetails + bookDetail + "\n";
        }
        view.print(booksDetails);
    }
}