package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private Section book;
    private Section movie;

    public Library(Section book, Section movie) {
        this.book = book;
        this.movie = movie;
    }

    public ArrayList<Item> books() {
        return book.items();
    }

    public boolean checkoutBook(String bookName) {
        return book.checkout(bookName);
    }

    public boolean checkinBook(String bookName) {
        return book.checkin(bookName);
    }

    public boolean checkoutMovie(String movieBook) {
        return movie.checkout(movieBook);
    }
}