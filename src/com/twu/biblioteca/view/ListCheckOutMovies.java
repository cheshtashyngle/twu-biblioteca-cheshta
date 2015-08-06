package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.Library;


public class ListCheckOutMovies implements View {
    private Library library;
    private Console console;
    private View nextView;

    public ListCheckOutMovies(Library library, Console console, View nextView) {
        this.library = library;
        this.console = console;
        this.nextView = nextView;
    }
    @Override
    public void performAction() {
        console.print(library.checkedOutMovies());
        nextView.performAction();
    }
}
