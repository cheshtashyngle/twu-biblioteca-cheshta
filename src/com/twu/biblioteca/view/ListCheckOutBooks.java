package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.Library;


public class ListCheckOutBooks implements View {
    private Library library;
    private Console console;
    private View nextView;

    public ListCheckOutBooks(Library library, Console console, View nexView) {
        this.library = library;
        this.console = console;
        this.nextView = nexView;
    }

    @Override
    public void performAction() {
        console.print(library.checkedOutBooks());
        nextView.performAction();
    }
}
