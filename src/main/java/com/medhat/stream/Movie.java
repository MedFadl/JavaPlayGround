package com.medhat.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Movie {
    private String name;
    private int like;

    public Movie(String name, int like) {
        this.name = name;
        this.like = like;
    }

    public Movie() {

        List<Movie> movies = List.of(
                new Movie("The Matrix", 10),
                new Movie("The Godfather", 20),
                new Movie("I wanna sleep", 999),
                new Movie("Inception", 15),
                new Movie("Interstellar", 25),
                new Movie("The Dark Knight", 30),
                new Movie("Fight Club", 18),
                new Movie("Forrest Gump", 22),
                new Movie("Gladiator", 17),
                new Movie("Titanic", 12),
                new Movie("Avatar", 14),
                new Movie("The Shawshank Redemption", 35),
                new Movie("Pulp Fiction", 28),
                new Movie("The Lord of the Rings", 40)
        );


        long count = movies.stream()
                .filter(movie -> movie.getLike() > 10)
                .count();
        System.out.println(count);

        movies.stream()
                .dropWhile(movie -> movie.getLike() == 10)
                .peek(movie -> System.out.println("filtered : " + movie.getName()))
                .sorted(Comparator.comparing(Movie::getLike).reversed())
                .distinct()
                .forEach(movie -> System.out.println(movie.getName()));

        Optional<Integer> likesSum = movies.stream()
                .distinct()
                .map(Movie::getLike)
                .reduce(Integer::sum);

        System.out.println(likesSum.orElse(0));
    }

    public int getLike() {
        return like;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return like == movie.like && Objects.equals(name, movie.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, like);
    }
}