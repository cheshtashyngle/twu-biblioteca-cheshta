package com.twu.biblioteca;

public class Checkout implements Command{
    private Library library;
    private View view;
    private String bookName;

    public Checkout(Library library, View view, String bookName) {
        this.library = library;
        this.view = view;
        this.bookName = bookName;
    }

    @Override
    public void execute() {
        boolean flag = library.checkout(bookName);
        String checkoutMessage = "Thank you! Enjoy the book\n";
        if(!flag)
            checkoutMessage = "That book is not available\n";
        view.print(checkoutMessage);
    }
}
