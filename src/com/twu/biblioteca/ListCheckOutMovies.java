package com.twu.biblioteca;

public class ListCheckOutMovies implements Command {
    private Library library;
    private View view;

    public ListCheckOutMovies(Library library, View view) {
        this.library = library;
        this.view = view;
    }

    @Override
    public void execute() {

    }
}
