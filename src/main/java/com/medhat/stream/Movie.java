package com.medhat.stream;

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
}
