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
            if(book.hasTitle(bookName)) {
                books.remove(book);
                issuedBooks.add(book);
                flag = true;
                break;
            }
        }
        return flag;
    }

    public boolean checkin(String bookName) {
        boolean flag = false;
        for(Book book : issuedBooks) {
            if(book.hasTitle(bookName)) {
                books.add(book);
                issuedBooks.remove(book);
                flag = true;
                break;
            }
        }
        return flag;
    }
}