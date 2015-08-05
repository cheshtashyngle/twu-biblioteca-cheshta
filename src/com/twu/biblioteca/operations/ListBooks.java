package com.twu.biblioteca.operations;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.Item;
import com.twu.biblioteca.model.Library;

import java.util.ArrayList;


public class ListBooks implements Command {
    private Library library;
    private Console console;

    public ListBooks(Library library, Console console) {
        this.library = library;
        this.console = console;
    }

    public void execute() {
        ArrayList<Item> books =library.books();
        String booksDetails = "";
        for (Item book : books) {
            String bookDetail = book.toString();
            booksDetails = booksDetails + bookDetail + "\n";
        }
        console.print(booksDetails);
    }
}