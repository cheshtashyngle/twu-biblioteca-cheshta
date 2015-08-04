package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.View;

public class CheckinBook implements Command {
    private Library library;
    private View view;
    String bookName;

    public CheckinBook(Library library, View view, String bookName) {
        this.library = library;
        this.view = view;
        this.bookName = bookName;
    }

    @Override
    public void execute() {
        String checkinMessage;
        if(library.checkinBook(bookName))
            checkinMessage= "Thank you for returning the book\n";
        else
            checkinMessage = "That is not a valid book to return\n";
        view.print(checkinMessage);
    }
}
