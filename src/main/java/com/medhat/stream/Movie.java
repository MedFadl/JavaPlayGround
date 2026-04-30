package com.medhat.stream;

import java.util.List;

public class Movie {
    private String name;
    private int like;

    public Movie(String name, int like) {
        this.name = name;
        this.like = like;
    }

    public int getLike() {
        return like;
    }

    List<Movie> movies = List.of(
            new Movie("The Matrix", 10),
            new Movie("The Godfather", 20)
    );
    //Declerative ..... (instead of imperative) (How vs What)
    long count = movies.stream()
            .filter(movie -> movie.getLike() > 10)
            .count();
}

