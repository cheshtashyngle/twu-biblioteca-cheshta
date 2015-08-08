package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.Library;


public class ListCheckOutMovies implements View {
    private Library library;
    private Console console;
    private View nextView;
    private View login;

    public ListCheckOutMovies(Library library, Console console, View nextView, View login) {
        this.library = library;
        this.console = console;
        this.nextView = nextView;
        this.login = login;
    }
    @Override
    public void performAction() {
        console.print(library.checkedOutMovies());
        nextView.performAction();
    }
}
