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
        boolean flag = library.checkin(bookName);
        String checkinMessage = "Thank you for returning the book\n";
        if(!flag)
            checkinMessage = "That is not a valid book to return\n";
        view.print(checkinMessage);
    }
}
