package com.medhat;

import com.medhat.stream.Movie;

import java.util.List;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        var s = Stream.generate(()-> (int) (Math.random() * 100));
        s.limit(10).forEach((x) -> System.out.println(x));
    }
}