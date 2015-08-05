package com.twu.biblioteca.operations;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.Item;
import com.twu.biblioteca.model.Library;

import java.util.ArrayList;

public class ListMovies implements Command {
    private Library library;
    private Console console;

    public ListMovies(Library library, Console console) {
        this.library = library;
        this.console = console;
    }

    @Override
    public void execute() {
        ArrayList<Item> movies =library.movies();
        String moviesDetails = "";
        for(int movieNo = 0; movieNo < movies.size();movieNo++) {
            String bookDetail = movies.get(movieNo).toString();
            moviesDetails = moviesDetails + bookDetail + "\n";
        }
        console.print(moviesDetails);
    }
}
