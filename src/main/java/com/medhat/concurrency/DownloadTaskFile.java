package com.medhat.concurrency;

public class DownloadTaskFile implements Runnable {

    private final DownloadStatus status;

    public DownloadTaskFile(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading file: " + Thread.currentThread().getName());

        for (int i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Download interrupted: " + Thread.currentThread().getName());
                return;
            }

            status.incrementTotalBytes();

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("Download completed: " + Thread.currentThread().getName());
    }
}