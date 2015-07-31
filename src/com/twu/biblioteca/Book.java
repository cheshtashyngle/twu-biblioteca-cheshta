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

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass())
            return false;
        Book that = (Book) other;
        return (this.name).equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (yearOfPublishing != null ? yearOfPublishing.hashCode() : 0);
        return result;
    }
}
