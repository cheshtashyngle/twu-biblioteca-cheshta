package com.twu.biblioteca;

public class CheckoutMovie implements Command{
    private Library library;
    private View view;
    private Movie movie;
    String movieBook;

    public CheckoutMovie(Library library, View view, String movieBook) {
        this.library = library;
        this.view = view;
        this.movieBook = movieBook;
    }

    @Override
    public void execute() {

    }
}
