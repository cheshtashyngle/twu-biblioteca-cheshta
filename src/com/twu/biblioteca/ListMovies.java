package com.twu.biblioteca;

import java.util.ArrayList;

public class ListMovies implements Command{
    private Library library;
    private View view;

    public ListMovies(Library library, View view) {
        this.library = library;
        this.view = view;
    }

    @Override
    public void execute() {
        ArrayList<Item> movies =library.movies();
        String moviesDetails = "";
        for(int movieNo = 0; movieNo < movies.size();movieNo++) {
            String bookDetail = movies.get(movieNo).toString();
            moviesDetails = moviesDetails + bookDetail + "\n";
        }
        view.print(moviesDetails);
    }
}
