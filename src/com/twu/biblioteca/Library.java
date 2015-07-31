package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books,issuedBooks;

    public Library(ArrayList<Book> books) {
        this.books = books;
        issuedBooks = new ArrayList<Book>();
    }

    public ArrayList<Book> books() {
        return books;
    }

    public boolean checkout(String bookName) {
        boolean flag = false;
        for(Book book : books) {
            if(book.equals(bookName)) {
                books.remove(book);
                issuedBooks.add(book);
                flag = true;
                break;
            }
        }
        return flag;
    }

    @Override
    public int hashCode() {
        return books != null ? books.hashCode() : 0;
    }

    public void checkin(String bookName) {
        for(Book book : issuedBooks) {
            if(book.equals(bookName)) {
                books.add(book);
                issuedBooks.remove(book);
                break;
            }
        }
    }
}