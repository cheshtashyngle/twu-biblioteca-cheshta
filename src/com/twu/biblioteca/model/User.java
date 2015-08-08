package com.twu.biblioteca.model;

public class User {
    private String libraryNumber;
    private String password;
    private boolean librarian;

    public User(String libraryNumber, String password, boolean librarian) {
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.librarian = librarian;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public boolean isLibrarian() {
        return librarian;
    }

    public boolean hasLoginCredentials(String libraryNumber, String password) {
        if(this.libraryNumber.equals(libraryNumber) && this.password.equals(password)) {
            return true;
        }
        return false;
    }
}