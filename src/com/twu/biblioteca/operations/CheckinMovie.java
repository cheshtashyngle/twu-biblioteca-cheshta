package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.View;

public class CheckinMovie implements Command {
    private Library library;
    private View view;
    private String movieName;

    public CheckinMovie(Library library, View view, String movieName) {
        this.library = library;
        this.view = view;
        this.movieName = movieName;
    }

    @Override
    public void execute() {
        String checkinMessage;
        if(library.checkinMovie(movieName))
            checkinMessage= "Thank you for returning the Movie\n";
        else
            checkinMessage = "That is not a valid Movie to return\n";
        view.print(checkinMessage);
    }
}
