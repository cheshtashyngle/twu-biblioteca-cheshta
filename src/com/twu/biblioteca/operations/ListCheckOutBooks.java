package com.twu.biblioteca.operations;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.Item;
import com.twu.biblioteca.model.Library;

import java.util.ArrayList;

public class ListCheckOutBooks implements Command {
    private Library library;
    private Console console;

    public ListCheckOutBooks(Library library, Console console) {
        this.library = library;
        this.console = console;
    }

    @Override
    public void execute() {
        ArrayList<Item> checkedOutBooks =library.checkedOutBooks();
        String booksDetails = "";
        for(int bookNo = 0; bookNo < checkedOutBooks.size();bookNo++) {
            String bookDetail = checkedOutBooks.get(bookNo).toString();
            booksDetails = booksDetails + bookDetail + "\n";
        }
        console.print(booksDetails);
    }
}
