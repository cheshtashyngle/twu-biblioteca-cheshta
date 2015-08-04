package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.View;

public class CheckoutBook implements Command {
    private Library library;
    private View view;
    private String bookName;

    public CheckoutBook(Library library, View view, String bookName) {
        this.library = library;
        this.view = view;
        this.bookName = bookName;
    }

    @Override
    public void execute() {
        String checkoutMessage;
        if(library.checkoutBook(bookName))
            checkoutMessage = "Thank you! Enjoy the book\n";
        else
            checkoutMessage = "That book is not available\n";
        view.print(checkoutMessage);
    }
}
