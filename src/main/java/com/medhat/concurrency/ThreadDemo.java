package com.medhat.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void showThread() {
        System.out.println("Thread Demo");

        var status = new DownloadStatus();
        Thread[] threads = new Thread[10];
        List<DownloadTaskFile> tasks = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            var task = new DownloadTaskFile(status);
            tasks.add(task);

            threads[i] = new Thread(task, "Worker-" + i);
            threads[i].start();
        }
        var task2 = new Thread(()-> {
            while(!status.status) {
                synchronized (status) {
                    try {
                        status.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        );

        for (Thread thread : threads) {
            try {
                thread.join();
                System.out.println(thread.getName() + " is ready to be scanned");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Total bytes downloaded: " + status.getTotalBytes());
    }
}