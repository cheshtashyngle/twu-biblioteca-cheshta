package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.User;

public class CheckoutBook implements View {
    private Library library;
    private Console console;
    private View nextView;

    public CheckoutBook(Library library, Console console, View nextView) {
        this.library = library;
        this.console = console;
        this.nextView = nextView;
    }

    @Override
    public void performAction(User user) {
        console.print("Enter the book name\n");
        String bookName = console.input();
        if(library.checkoutBook(bookName, user))
            console.print("Thank you! Enjoy the book\n");
        else
            console.print("That book is not available\n");
        nextView.performAction(user);
    }
}
