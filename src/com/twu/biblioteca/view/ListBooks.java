package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.User;


public class ListBooks implements View {
    private Library library;
    private Console console;
    private View nextView;

    public ListBooks(Library library, Console console, View nextView) {
        this.library = library;
        this.console = console;
        this.nextView = nextView;
    }

    public void performAction(User user) {
        console.print(library.books());
        nextView.performAction(user);
    }
}