package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.console.Console;

public class CheckoutMovie implements Command {
    private Library library;
    private Console console;
    String movieName;

    public CheckoutMovie(Library library, Console console, String movieName) {
        this.library = library;
        this.console = console;
        this.movieName = movieName;
    }

    @Override
    public void execute() {
        String checkoutMessage;
        if(library.checkoutMovie(movieName))
            checkoutMessage = "Thank you! Enjoy the movie\n";
        else
            checkoutMessage = "That movie is not available\n";
        console.print(checkoutMessage);
    }
}
