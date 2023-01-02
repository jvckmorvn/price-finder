package com.jvckmorvn;

import java.util.concurrent.CompletableFuture;

public class FlightService {
  public CompletableFuture<Quote> getQuote(String site) {
    return CompletableFuture.supplyAsync(() -> {
      System.out.println("Getting quote from " + site);
      int price = (int)(100 * Math.random());
      return new Quote(site, price);
    });
  }
}
