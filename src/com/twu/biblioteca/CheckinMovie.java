package com.twu.biblioteca;

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

    }
}
