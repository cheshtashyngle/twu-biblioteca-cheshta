package com.twu.biblioteca.operations;

import com.twu.biblioteca.view.View;
import com.twu.biblioteca.model.Item;
import com.twu.biblioteca.model.Library;

import java.util.ArrayList;

public class ListCheckOutMovies implements Command {
    private Library library;
    private View view;

    public ListCheckOutMovies(Library library, View view) {
        this.library = library;
        this.view = view;
    }
    @Override
    public void execute() {
        ArrayList<Item> checkedOutMovies =library.checkedOutMovies();
        String booksDetails = "";
        for(int bookNo = 0; bookNo < checkedOutMovies.size();bookNo++) {
            String bookDetail = checkedOutMovies.get(bookNo).toString();
            booksDetails = booksDetails + bookDetail + "\n";
        }
        view.print(booksDetails);
    }
}
