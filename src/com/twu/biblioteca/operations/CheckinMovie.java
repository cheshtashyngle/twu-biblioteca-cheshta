package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.console.Console;

public class CheckinMovie implements Command {
    private Library library;
    private Console console;
    private String movieName;

    public CheckinMovie(Library library, Console console, String movieName) {
        this.library = library;
        this.console = console;
        this.movieName = movieName;
    }

    @Override
    public void execute() {
        String checkinMessage;
        if(library.checkinMovie(movieName))
            checkinMessage= "Thank you for returning the Movie\n";
        else
            checkinMessage = "That is not a valid Movie to return\n";
        console.print(checkinMessage);
    }
}
