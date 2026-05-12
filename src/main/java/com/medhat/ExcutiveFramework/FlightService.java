package com.medhat.ExcutiveFramework;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class FlightService {

    public List<CompletableFuture<FlightQuote>> getQuotes(String[] names) {
        var sites = List.of(names);
        return sites.stream()
                .map(this::getQuotaAsync)
                .toList();
    }
    public CompletableFuture<FlightQuote> getQuotaAsync(String name) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting quote from " + name);
            LongTask.simulate();
            var random = new Random();
            return new FlightQuote(name, random.nextInt(100));
        });
    }
}
