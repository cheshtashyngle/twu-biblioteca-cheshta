package com.twu.biblioteca;

public class Checkin implements Command {
    private Library library;
    private View view;
    String bookName;

    public Checkin(Library library, View view, String bookName) {
        this.library = library;
        this.view = view;
        this.bookName = bookName;
    }

    @Override
    public void execute() {

    }
}
