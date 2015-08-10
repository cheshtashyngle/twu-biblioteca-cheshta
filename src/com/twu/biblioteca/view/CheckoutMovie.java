package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.User;

public class CheckoutMovie implements View {
    private Library library;
    private Console console;
    private View nextView;
    private Login login;

    public CheckoutMovie(Library library, Console console, View nextView) {
        this.library = library;
        this.console = console;
        this.nextView = nextView;
    }

    @Override
    public void performAction(User user) {
        console.print("Enter the movie name\n");
        String movieName = console.input();
        if(library.checkoutMovie(movieName, user))
            console.print("Thank you! Enjoy the movie\n");
        else
            console.print("That movie is not available\n");
        nextView.performAction(user);
    }
}
