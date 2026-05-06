package com.medhat.concurrency;

public class ThreadDemo {
    public static void showThread() {
        System.out.println("Thread Demo");


        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadTaskFile());
            thread.start();
        }
        //Threads
        //System.out.println(Thread.activeCount());
        //System.out.println(Runtime.getRuntime().availableProcessors());

    }
}
