package com.medhat.concurrency;

public class ThreadDemo {
    public static void showThread() {
        System.out.println("Thread Demo");

        var status = new DownloadStatus();
        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new DownloadTaskFile(status), "Worker-" + i);
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
                System.out.println(thread.getName() + " is ready to be scanned");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(status.getTotalBytes());
    }
}