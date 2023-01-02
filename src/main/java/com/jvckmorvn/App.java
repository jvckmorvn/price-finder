package com.jvckmorvn;


public final class App {
  public static void main(String[] args) {
    App.show();
  }

  public static void show() {
    FlightService service = new FlightService();
    service.getQuote("https://breezyjet.com/")
            .thenAccept(System.out::println);

    try {
      Thread.sleep(4_000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
