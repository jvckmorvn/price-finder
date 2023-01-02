package com.jvckmorvn;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class FlightService {
  public Stream<CompletableFuture<Quote>> getQuotes() {
    var websites = List.of("site1", "site2", "site3");
    return websites.stream()
                    .map(this::getQuote);
  }

  public CompletableFuture<Quote> getQuote(String website) {
    return CompletableFuture.supplyAsync(() -> {
      System.out.println("Getting quote from " + website);
      var price = (int)(100 * Math.random());
      LongTask.simulate(price * 10);
      return new Quote(website, price);
    });
  }
}
