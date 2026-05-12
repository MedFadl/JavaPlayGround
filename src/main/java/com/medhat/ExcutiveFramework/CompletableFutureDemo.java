package com.medhat.ExcutiveFramework;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;

public class CompletableFutureDemo {
    public static void show() {
        ForkJoinPool.commonPool(); //default pool so we need to identify the pool we need  (based on number of available processors)
        Runnable task = () -> System.out.println("Hello");
        var future = CompletableFuture.runAsync(task); //to execute a task asynchronously
        Supplier<Integer> task2 = () -> 42;
        var future2 = CompletableFuture.supplyAsync(task2);// to return a value asynchronously
        Integer result = null;
        try {
            result = future2.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Result: " + result);
    }

    public static void show2() {
        var future = CompletableFuture.supplyAsync(()-> 1);
        future.thenRunAsync(() -> { // it will run on the thread commonpool
            //thenRun is similar to thenAccept but will run on main thread
            System.out.println(Thread.currentThread().getName());
            System.out.println("Task completed");
        }); // CompletionStage

        future.thenAccept(result -> System.out.println(result)); //main thread and thenAcceptAsync will run on the coomon pool but we need to wait



    }
}
