package com.jvckmorvn;

public class Quote {
  private String website = new String();
  private int price;

  public Quote(String website, int price) {
    this.website = website;
    this.price = price;
  }

  @Override
  public String toString() {
    return "Quote{" + "website='" + website + "', price=" + price + "}";
  }

  public String getWebsite() {
    return website;
  }

  public int getPrice() {
    return price;
  }
}
