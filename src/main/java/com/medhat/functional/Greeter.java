package com.medhat.functional;

public class Greeter {

    static void greet(Printer printer)
    {
        printer.print("wow");
    }

    static void show ()
    {
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }
}
