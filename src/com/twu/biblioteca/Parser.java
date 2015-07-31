package com.twu.biblioteca;

public class Parser {
    private Library library;
    private View view;

    public Parser(Library library, View view) {
        this.library = library;
        this.view = view;
    }

    public Command parseCommand(String input) {
        if(input == "1")
            return new ListBooks(library, view);
        else
            return new InvalidOption();
    }
}
