package com.medhat.stream;

import java.util.Comparator;
import java.util.List;

public class Movie {
    private String name;
    private int like;

    List<Movie> movies = List.of(
            new Movie("The Matrix", 10),
            new Movie("The Godfather", 20),
            new Movie("I wanna sleep", 999)
    );

    public Movie(String name, int like) {
        this.name = name;
        this.like = like;

        //Declerative ... (instead of imperative) (How vs What)
        long count = movies.stream()
                .filter(movie -> movie.getLike() > 10)
                .count();
        System.out.println(count);


        movies.stream()
                .dropWhile(movie -> movie.getLike() == 10)
                .peek(movie -> System.out.println("filtered : " + movie.getName())) // for debugging and looking what actually happen after dropwhile but still can continue on stream
                .sorted(Comparator.comparing(Movie::getLike).reversed())
                .distinct()
                .forEach(movie -> System.out.println(movie.getName()));


    }

    public int getLike() {
        return like;
    }
    public String getName() {
        return name;
    }




}

