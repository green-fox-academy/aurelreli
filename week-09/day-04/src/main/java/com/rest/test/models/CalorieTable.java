package com.rest.test.models;

import java.util.ArrayList;
import java.util.List;

public class CalorieTable {
  private List<Food> foods;

  public CalorieTable() {
    List<Food> foods = new ArrayList<>();
    foods.add(new Food("pizza", 6, 300));
    foods.add(new Food("burger", 3, 600));
    foods.add(new Food("soup", 2, 200));
    foods.add(new Food("quesadilla", 5, 400));
    this.foods = foods;
  }

  public List<Food> getFoods() {
    return foods;
  }

  public Food findFoodByName(String name) {
    return foods.stream().filter(x -> x.getName().equals(name)).findFirst().orElse(null);
  }

  public void addFood(String name, int amount, int calorie) {
    foods.add(new Food(name, amount, calorie));
  }

  public void removeFood(String name) {
    foods.remove(findFoodByName(name));
  }

  public void modifyAmount(String name, int amount) {
    findFoodByName(name).setAmount(amount);
  }
}
