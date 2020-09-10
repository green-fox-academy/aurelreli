package com.programmerfoxclub.foxclub.models;

import com.programmerfoxclub.foxclub.services.FoxService;
import java.util.ArrayList;
import java.util.List;

public class Fox {
  private String name;
  private List<String> tricks;
  private String food;
  private String drink;


  public Fox(String name, String food, String drink) {
    this.name = name;
    this.food = food;
    this.drink = drink;
    tricks = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public List<String> getTricks() {
    return tricks;
  }

  public String getDrink() {
    return drink;
  }

  public String getFood() {
    return food;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public void setFood(String food) {
    this.food = food;
  }

}
