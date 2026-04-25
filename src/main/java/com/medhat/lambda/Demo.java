package com.medhat.lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {
    public static void show()
    {
        greet(System.out::println);
        Supplier<Double> getRandom = Math::random;
        var random = getRandom.get();
        System.out.println(random);
        Function<String,Integer> map = String::length;
        var length = map.apply("Medhat");
        System.out.println(length);
        Predicate<String> isLongerThan = (item) -> item.length() > 5;
        var isLong = isLongerThan.test("Medhat");
        System.out.println(isLong);
        System.out.println(isLongerThan.or(item -> item.length() < 5).test("Medhat"));
    }

    public static void greet(Printer printer)
    {
        List<String> list = List.of("Hello", "Hi", "Hey");
        Consumer<String> print = (item) -> System.out.println(item);
        Consumer<String> printUpperCase = (item) -> System.out.println(item.toUpperCase());
        list.forEach(print.andThen(printUpperCase));
        printer.print("Medhat was here");
    }
}
