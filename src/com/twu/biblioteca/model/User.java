package com.twu.biblioteca.model;

public class User {
    private String libraryNumber;
    private String password;
    private String name;
    private String emailAddress;
    private String mobile;
    private boolean librarian;

    public User(String libraryNumber, String password, String name, String emailAddress, String mobile, boolean librarian) {
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.name = name;
        this.emailAddress = emailAddress;
        this.mobile = mobile;
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

    @Override
    public String toString() {
        return "User{" +
                " name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", mobile='" + mobile + '\'' +
                '}' + '\n';
    }
}