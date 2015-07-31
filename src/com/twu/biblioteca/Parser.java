package com.twu.biblioteca;

public class Parser {
    private Library library;
    private View view;

    public Parser(Library library, View view) {
        this.library = library;
        this.view = view;
    }

    public ListBooks parseCommand(String input) {
        return new ListBooks(library, view);
    }
}
