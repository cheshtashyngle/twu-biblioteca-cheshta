package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.console.Console;

public class CheckinMovie implements View {
    private Library library;
    private Console console;
    private View nextView;
    private Login login;

    public CheckinMovie(Library library, Console console, View nextView, Login login) {
        this.library = library;
        this.console = console;
        this.nextView = nextView;
        this.login = login;
    }

    @Override
    public void performAction() {
        console.print("Enter the movie name\n");
        String movieName = console.input();
        if(library.checkinMovie(movieName, login.getCurrentUser()))
            console.print("Thank you for returning the Movie\n");
        else
            console.print("That is not a valid Movie to return\n");
        nextView.performAction();
    }
}
