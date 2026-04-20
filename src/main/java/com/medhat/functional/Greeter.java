package com.medhat.functional;

public class Greeter {

    static void greet(Printer printer)
    {
        printer.print("wow");
    }

//old
    static void show ()
    {
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }
//new
    static void show2()
    {
        greet(message -> System.out.println(message));
        //weird way, but I think I will try to get used to it in the next iterations of me learning
        greet(System.out::println);
    }
}
