package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.console.Console;

public class CheckinBook implements Command {
    private Library library;
    private Console console;
    String bookName;

    public CheckinBook(Library library, Console console, String bookName) {
        this.library = library;
        this.console = console;
        this.bookName = bookName;
    }

    @Override
    public void execute() {
        String checkinMessage;
        if(library.checkinBook(bookName))
            checkinMessage= "Thank you for returning the book\n";
        else
            checkinMessage = "That is not a valid book to return\n";
        console.print(checkinMessage);
    }
}
