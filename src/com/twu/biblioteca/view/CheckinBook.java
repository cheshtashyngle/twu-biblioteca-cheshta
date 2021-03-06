package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.User;

public class CheckinBook implements View {
    private Library library;
    private Console console;
    private View nextView;

    public CheckinBook(Library library, Console console, View nextView) {
        this.library = library;
        this.console = console;
        this.nextView = nextView;
    }

    @Override
    public void performAction(User user) {
        console.print("Enter the book name\n");
        String bookName = console.input();
        if(library.checkinBook(bookName, user))
            console.print("Thank you for returning the book\n");
        else
            console.print("That is not a valid book to return\n");
        nextView.performAction(user);
    }
}
