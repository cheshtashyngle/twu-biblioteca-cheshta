package com.twu.biblioteca;

public class ListCheckOutBooks implements Command {
    private Library library;
    private View view;

    public ListCheckOutBooks(Library library, View view) {
        this.library = library;
        this.view = view;
    }

    @Override
    public void execute() {

    }
}
