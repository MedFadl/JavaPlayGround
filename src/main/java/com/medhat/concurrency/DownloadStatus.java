package com.medhat.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private final AtomicInteger totalBytes = new AtomicInteger();

    //Syncronization with lock and unlock but  it is not the best practice so i commented it to learn :D
    //private Lock lock = new ReentrantLock();

    public int getTotalBytes() {
        return totalBytes.get();
    }

    public void incrementTotalBytes() {
        //lock.lock();
        try{
            totalBytes.incrementAndGet();
        }
        finally {
            // lock.unlock();
        }
    }
}