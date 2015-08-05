package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.console.Console;

public class CheckoutBook implements Command {
    private Library library;
    private Console console;
    private String bookName;

    public CheckoutBook(Library library, Console console, String bookName) {
        this.library = library;
        this.console = console;
        this.bookName = bookName;
    }

    @Override
    public void execute() {
        String checkoutMessage;
        if(library.checkoutBook(bookName))
            checkoutMessage = "Thank you! Enjoy the book\n";
        else
            checkoutMessage = "That book is not available\n";
        console.print(checkoutMessage);
    }
}
