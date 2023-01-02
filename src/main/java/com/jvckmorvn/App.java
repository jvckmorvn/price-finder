package com.jvckmorvn;

import java.util.stream.Collectors;

public final class App {
  public static void main(String[] args) {
    App.show();
  }

  public static void show() {
    var service = new FlightService();
    service.getQuotes()
            .map(future -> future.thenAccept(System.out::println))
            .collect(Collectors.toList());


    try {
      Thread.sleep(4_000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
