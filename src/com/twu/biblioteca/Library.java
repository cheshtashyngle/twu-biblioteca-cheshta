package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> books() {
        return books;
    }

    public boolean checkout(String bookname) {
        boolean flag = false;
        for(int i = 0;i < books.size();i++) {
            if(books.get(i).equals(bookname)) {
                books.remove(books.get(i));
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

}