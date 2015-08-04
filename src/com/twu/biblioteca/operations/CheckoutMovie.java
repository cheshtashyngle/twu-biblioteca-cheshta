package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.View;

public class CheckoutMovie implements Command {
    private Library library;
    private View view;
    String movieName;

    public CheckoutMovie(Library library, View view, String movieName) {
        this.library = library;
        this.view = view;
        this.movieName = movieName;
    }

    @Override
    public void execute() {
        String checkoutMessage;
        if(library.checkoutMovie(movieName))
            checkoutMessage = "Thank you! Enjoy the movie\n";
        else
            checkoutMessage = "That movie is not available\n";
        view.print(checkoutMessage);
    }
}
