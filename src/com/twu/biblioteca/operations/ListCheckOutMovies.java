package com.twu.biblioteca.operations;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.Item;
import com.twu.biblioteca.model.Library;

import java.util.ArrayList;

public class ListCheckOutMovies implements Command {
    private Library library;
    private Console console;

    public ListCheckOutMovies(Library library, Console console) {
        this.library = library;
        this.console = console;
    }
    @Override
    public void execute() {
        ArrayList<Item> checkedOutMovies =library.checkedOutMovies();
        String booksDetails = "";
        for(int bookNo = 0; bookNo < checkedOutMovies.size();bookNo++) {
            String bookDetail = checkedOutMovies.get(bookNo).toString();
            booksDetails = booksDetails + bookDetail + "\n";
        }
        console.print(booksDetails);
    }
}
