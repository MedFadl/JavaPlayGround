package com.medhat.functional;

public interface Printer {
    void print(String message);
    default void print()
    {
        System.out.println("Adding implementation here... is kinda useless for java's interfaces");
    }
}
