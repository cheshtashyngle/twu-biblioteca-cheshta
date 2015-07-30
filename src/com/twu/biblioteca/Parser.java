package com.twu.biblioteca;

public class Parser {
    private String input;
    Library library;
    View view;

    public Parser(String input, Library library, View view) {
        this.input = input;
        this.library = library;
        this.view = view;
    }

    public ListBooks parseCommand() {
        return new ListBooks(library, view);
    }
}
