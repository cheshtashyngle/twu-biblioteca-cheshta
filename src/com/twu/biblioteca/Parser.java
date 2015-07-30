package com.twu.biblioteca;

public class Parser {
    private String input;

    public Parser(String input) {
        this.input = input;
    }

    public ListBooks parseCommand() {
        return new ListBooks();
    }
}
