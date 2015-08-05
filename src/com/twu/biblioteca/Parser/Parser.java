package com.twu.biblioteca.Parser;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.operations.*;
import com.twu.biblioteca.view.View;

public class Parser {
    private Library library;
    private View view;

    public Parser(Library library, View view) {
        this.library = library;
        this.view = view;
    }

    public Command parseCommand(String input) {
        String[] inputs = input.split("-");
        if(inputs[0].equals("ListBooks")) {
            return new ListBooks(library, view);
        }
        else if(inputs[0].equals("ListCheckedOutBooks")) {
            return new ListCheckOutBooks(library, view);
        }
        else if(inputs[0].equals("ListMovies")) {
            return new ListMovies(library, view);
        }
        else if(inputs[0].equals("ListCheckedOutMovies")) {
            return new ListCheckOutMovies(library, view);
        }
        else if(inputs[0].equals("CheckoutBook")) {
            return new CheckoutBook(library, view, inputs[1]);
        }
        else if(inputs[0].equals("CheckinBook")) {
            return new CheckinBook(library, view, inputs[1]);
        }
        else if(inputs[0].equals("CheckoutMovie")) {
            return new CheckoutMovie(library, view, inputs[1]);
        }
        else if(inputs[0].equals("CheckinMovie")) {
            return new CheckinMovie(library, view, inputs[1]);
        }
        else if(input.equals("Quit")) {
            return new Quit();
        }
        else {
            return new InvalidOption(view, this);
        }
    }
}