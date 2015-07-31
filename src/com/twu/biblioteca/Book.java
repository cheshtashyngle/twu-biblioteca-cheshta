package com.twu.biblioteca;

public class Book {
    private String name;
    private String author;
    private String yearOfPublishing;

    public Book(String name, String author, String yearOfPublishing) {
        this.name = name;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String name() {
        return name;
    }

    public boolean equals(String thatName) {
        return name.equals(thatName);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (yearOfPublishing != null ? yearOfPublishing.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return  name + '|' +
               author + '|' +
               yearOfPublishing + '|'
                ;
    }
}
