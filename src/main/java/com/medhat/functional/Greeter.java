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
    }
}
