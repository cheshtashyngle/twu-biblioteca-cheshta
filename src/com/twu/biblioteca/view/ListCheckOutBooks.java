package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.Library;


public class ListCheckOutBooks implements View {
    private Library library;
    private Console console;
    private View nextView;
    private View login;

    public ListCheckOutBooks(Library library, Console console, View nexView, View login) {
        this.library = library;
        this.console = console;
        this.nextView = nexView;
        this.login = login;
    }

    @Override
    public void performAction() {
        console.print(library.checkedOutBooks());
        nextView.performAction();
    }
}
