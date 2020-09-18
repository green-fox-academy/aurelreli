package com.rest.test.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Food {
  @Id
  private String name;
  private int amount;
  private int calorie;

  public Food() {}

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
