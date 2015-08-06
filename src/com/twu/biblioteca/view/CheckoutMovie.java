package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.console.Console;

public class CheckoutMovie implements View {
    private Library library;
    private Console console;
    private View nextView;

    public CheckoutMovie(Library library, Console console, View nextView) {
        this.library = library;
        this.console = console;
        this.nextView = nextView;
    }

    @Override
    public void performAction() {
        console.print("Enter the movie name\n");
        String movieName = console.input();
        if(library.checkoutMovie(movieName))
            console.print("Thank you! Enjoy the movie\n");
        else
            console.print("That movie is not available\n");
        nextView.performAction();
    }
}
