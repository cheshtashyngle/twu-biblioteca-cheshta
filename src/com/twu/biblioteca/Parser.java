package com.twu.biblioteca;

public class Parser {
    private Library library;
    private View view;

    public Parser(Library library, View view) {
        this.library = library;
        this.view = view;
    }

    public Command parseCommand(String input) {
        if(input.equals("ListBooks"))
            return new ListBooks(library, view);
        else if(input.equals("Checkout"))
            return new Checkout();
        else if(input.equals("Quit"))
            return new Quit();
        else
            return new InvalidOption(view, this);
    }
}
