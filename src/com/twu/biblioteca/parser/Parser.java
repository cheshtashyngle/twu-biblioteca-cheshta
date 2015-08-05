package com.twu.biblioteca.parser;

import com.twu.biblioteca.model.*;
import com.twu.biblioteca.operations.*;
import com.twu.biblioteca.console.Console;

public class Parser {
    private Library library;
    private Console console;

    public Parser(Library library, Console console) {
        this.library = library;
        this.console = console;
    }

    public Command parseCommand(String input) {
        String[] inputs = input.split("-");
        if(inputs[0].equals("ListBooks")) {
            return new ListBooks(library, console);
        }
        else if(inputs[0].equals("ListCheckedOutBooks")) {
            return new ListCheckOutBooks(library, console);
        }
        else if(inputs[0].equals("ListMovies")) {
            return new ListMovies(library, console);
        }
        else if(inputs[0].equals("ListCheckedOutMovies")) {
            return new ListCheckOutMovies(library, console);
        }
        else if(inputs[0].equals("CheckoutBook")) {
            return new CheckoutBook(library, console, inputs[1]);
        }
        else if(inputs[0].equals("CheckinBook")) {
            return new CheckinBook(library, console, inputs[1]);
        }
        else if(inputs[0].equals("CheckoutMovie")) {
            return new CheckoutMovie(library, console, inputs[1]);
        }
        else if(inputs[0].equals("CheckinMovie")) {
            return new CheckinMovie(library, console, inputs[1]);
        }
        else if(input.equals("Quit")) {
            return new Quit();
        }
        else {
            return new InvalidOption(console, this);
        }
    }
}
