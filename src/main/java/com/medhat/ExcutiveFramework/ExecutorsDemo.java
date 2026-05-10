package com.medhat.ExcutiveFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorsDemo {
    public static void show() {
        ExecutorService exec = null;
        try {
            exec = Executors.newFixedThreadPool(2);
            for (int i = 0; i < 10; i++) {
                var future = exec.submit(() -> {
                    LongTask.simulate();
                    System.out.println(Thread.currentThread().getName());
                    return 1;
                });
                System.out.println("bla bla bla");
                try {
                    var result = future.get();
                    System.out.println(result);
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }
        } finally {
            assert exec != null;
            exec.shutdown();
        }
    }
}

