package com.programmerfoxclub.foxclub.models;

import com.programmerfoxclub.foxclub.services.FoxService;
import java.util.List;

public class Fox {
  FoxService foxService;
  private String name;
  private List<String> tricks;
  private String food;
  private String drink;

  public Fox(String name, FoxService foxService) {
    this.name = name;
    foxService = new FoxService();
    food = foxService.getFoods().get(0);
    drink = foxService.getDrinks().get(0);
    tricks.add(foxService.getTrickPack().get(0));
    tricks.add(foxService.getTrickPack().get(1));
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
}
