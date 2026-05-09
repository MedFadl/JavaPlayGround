package com.medhat.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    //Atomic integer is more thread-Safekeeping.
    private final AtomicInteger totalBytes = new AtomicInteger();
    private final Object totalBytesLock = new Object();
    private final Object totalFilesLock = new Object();
    public volatile boolean status = false;

    //Synchronization with lock and unlock, but it is not the best practice, so I commented it to learn :D
    //private Lock lock = new ReentrantLock();



    public int getTotalBytes() {
        return totalBytes.get();
    }

    public void incrementTotalBytes() { //can add synchronized after public, but that's more bad
        //lock.lock();
        //Another way to sync without a lock!!! with Synchronized () {} but don't add this as it will cause performance issue (unnecessary wait)
                totalBytes.incrementAndGet();

       // finally {
            // lock.unlock();
       // }
    }


    public void setStatus(boolean status) {
        this.status = status;
    }

    //Another way of changing  and making everything amazing and wonderful.


}

// A synchronization can add a deadlock! so take care please :D love you all <3