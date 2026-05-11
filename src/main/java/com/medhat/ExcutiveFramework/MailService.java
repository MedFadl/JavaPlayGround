package com.medhat.ExcutiveFramework;

import java.util.concurrent.CompletableFuture;

public class MailService {
    public void sendMail() {
        LongTask.simulate();
        System.out.println("Mail was sent!!");
    }

    //we can change a method to async by wrapping it with CompletableFuture<T> and it will change our function to tutututututututu ASYNC!!!
    public CompletableFuture<Void> sendAsyncMail() {
        return CompletableFuture.runAsync(()->sendMail());  //or this::sendMail looks more fancy :DDDDD!

    }

}
