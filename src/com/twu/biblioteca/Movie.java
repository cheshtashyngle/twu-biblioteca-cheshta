package com.twu.biblioteca;

public class Movie extends Item{

    String year;
    String director;
    int movieRating;

    public Movie(String name, String year, String director, int movieRating) {
        super(name);
        this.year = year;
        this.director = director;
        this.movieRating = movieRating;
    }
}
