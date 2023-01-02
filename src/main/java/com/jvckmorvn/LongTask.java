package com.jvckmorvn;

public class LongTask {
  public static void simulate() {
    try {
      Thread.sleep(5_000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void simulate(int delay) {
    try {
      Thread.sleep(delay);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
