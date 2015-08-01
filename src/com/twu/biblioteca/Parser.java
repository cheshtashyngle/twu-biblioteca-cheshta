package com.twu.biblioteca;

public class Parser {
    private Library library;
    private View view;

    public Parser(Library library, View view) {
        this.library = library;
        this.view = view;
    }

    public Command parseCommand(String input) {
        if(input.equals("ListBooks")) {
            return new ListBooks(library, view);
        }
        else if(input.equals("CheckoutBook")) {
            String bookName = view.input();
            return new CheckoutBook(library, view, bookName);
        }
        else if(input.equals("CheckinBook")) {
            String bookName = view.input();
            return new CheckinBook(library, view, bookName);
        }
        else if(input.equals("CheckoutMovie")) {
            String movieName = view.input();
            return new CheckoutMovie(library, view, movieName);
        }
        else if(input.equals("Quit")) {
            return new Quit();
        }
        else {
            return new InvalidOption(view, this);
        }
    }
}
