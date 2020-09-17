package com.rest.test.models;

public class Food {
  private String name;
  private int amount;
  private int calorie;

  public Food(String name, int amount, int calorie) {
    this.name = name;
    this.amount = amount;
    this.calorie = calorie;
  }

  public String getName() {
    return name;
  }

  public int getAmount() {
    return amount;
  }

  public int getCalorie() {
    return calorie;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }
}
