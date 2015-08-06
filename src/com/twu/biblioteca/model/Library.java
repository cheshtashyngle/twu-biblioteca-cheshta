package com.twu.biblioteca.model;

public class Library {
    private Section book;
    private Section movie;

    public Library(Section book, Section movie) {
        this.book = book;
        this.movie = movie;
    }

    public String books() {
        return book.items();
    }

    public String movies() {
        return movie.items();
    }

    public boolean checkoutBook(String bookName) {
        return book.checkout(bookName);
    }

    public boolean checkinBook(String bookName) {
        return book.checkin(bookName);
    }

    public boolean checkoutMovie(String movieName) {
        return movie.checkout(movieName);
    }

    public boolean checkinMovie(String movieName)  {
        return movie.checkin(movieName);
    }

    public String checkedOutBooks() {
        return book.checkedOutItems();
    }

    public String checkedOutMovies() {
        return movie.checkedOutItems();
    }
}