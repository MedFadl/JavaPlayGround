package com.medhat.ExcutiveFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorsDemo {
    public static void show() {
        ExecutorService exec = null;
        try {
            exec = Executors.newFixedThreadPool(2);
            for (int i = 0; i < 10; i++) {
                exec.submit(() -> {
                    System.out.println(Thread.currentThread().getName());
                });
            }
        } finally {
            assert exec != null;
            exec.shutdown();
        }
    }
}

