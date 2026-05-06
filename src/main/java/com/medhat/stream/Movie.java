package com.medhat.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Movie {

    private String name;
    private int like;
    private Genre genre;

    public Movie(String name, int like, Genre genre) {
        this.name = name;
        this.like = like;
        this.genre = genre;
    }

    public Movie() {

        List<Movie> movies = List.of(
                new Movie("The Matrix", 10, Genre.ACTION),
                new Movie("The Godfather", 20, Genre.THRILLER),
                new Movie("I wanna sleep", 999, Genre.COMEDY),
                new Movie("Inception", 15, Genre.THRILLER),
                new Movie("The Dark Knight", 30, Genre.ACTION),
                new Movie("Fight Club", 18, Genre.THRILLER),
                new Movie("Forrest Gump", 22, Genre.COMEDY),
                new Movie("Gladiator", 17, Genre.ACTION),
                new Movie("Titanic", 12, Genre.HORROR),
                new Movie("Avatar", 14, Genre.ACTION),
                new Movie("Shawshank Redemption", 35, Genre.THRILLER),
                new Movie("Pulp Fiction", 28, Genre.ACTION),
                new Movie("Halloween", 40, Genre.HORROR)
        );

        long count = movies.stream()
                .filter(m -> m.like > 10)
                .count();

        System.out.println("Count > 10 likes: " + count);
        movies.stream()
                .filter(m -> m.like != 10)
                .sorted(Comparator.comparingInt(Movie::getLike).reversed())
                .distinct()
                .forEach(m -> System.out.println("Movie: " + m.name + " (" + m.like + ")"));

        int totalLikes = movies.stream()
                .mapToInt(m -> m.like)
                .sum();

        System.out.println("Total likes: " + totalLikes);

         var categorizedMovies = movies.stream()
                 .collect(Collectors.groupingBy(Movie::getGenre , Collectors.mapping(Movie::getName , Collectors.joining(", "))));
        System.out.println(categorizedMovies);

        var categorizedMoviesByLikes = movies.stream()
                .collect(
                        Collectors.partitioningBy(m->getLike() > 20,
                                Collectors.mapping(
                                        Movie::getName ,
                                        Collectors.joining(","))));
    }

    //GETTERS

    public int getLike() {
        return like;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }

}