package com.programmerfoxclub.foxclub.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FoxService {
  List<String> trickPack;
  List<String> foods;
  List<String> drinks;
  public FoxService() {
    trickPack = new ArrayList<>();
    trickPack.add("write HTML");
    trickPack.add("code in Java");
    trickPack.add("do a flip");
    trickPack.add("go running");

    foods = new ArrayList<>();
    foods.add("sandwich");
    foods.add("pizza");
    foods.add("steak");
    foods.add("caviar");

    drinks = new ArrayList<>();
    drinks.add("water");
    drinks.add("tea");
    drinks.add("pepsi");
    drinks.add("wine");
    drinks.add("champagne");
  }

  public List<String> getTrickPack() {
    return trickPack;
  }

  public List<String> getDrinks() {
    return drinks;
  }

  public List<String> getFoods() {
    return foods;
  }
}
