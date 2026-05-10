package com.medhat.ExcutiveFramework;

public class LongTask {
    public static void simulate()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
