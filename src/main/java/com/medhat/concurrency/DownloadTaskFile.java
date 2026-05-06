package com.medhat.concurrency;

public class DownloadTaskFile implements Runnable{
    @Override
    public void run() {
        System.out.println("Downloading file : " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Download Completed : " + Thread.currentThread().getName());
    }
}
