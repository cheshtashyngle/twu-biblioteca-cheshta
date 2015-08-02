package com.twu.biblioteca;

public class ListMovies implements Command{
    private Library library;
    private View view;

    public ListMovies(Library library, View view) {
        this.library = library;
        this.view = view;
    }

    @Override
    public void execute() {

    }
}
