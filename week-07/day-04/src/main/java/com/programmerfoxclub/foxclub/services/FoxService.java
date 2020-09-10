package com.programmerfoxclub.foxclub.services;

import com.programmerfoxclub.foxclub.models.Fox;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoxService {
  List<String> trickPack;
  List<String> foods;
  List<String> drinks;
  List<Fox> foxes;

  @Autowired
  public FoxService() {
    trickPack = new ArrayList<>();
    trickPack.add("write HTML");
    trickPack.add("code in Java");
    trickPack.add("do a flip");
    trickPack.add("go running");

    foods = new ArrayList<>();
    foods.add("bread");
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

    foxes = new ArrayList<>();
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

  public Fox getFoxByName(String name) {
    return foxes.stream()
        .filter(fox -> fox.getName().equals(name))
        .findFirst()
        .orElse(null);
  }

  public void addFox(String name) {
    Fox fox = new Fox(name, foods.get(0), drinks.get(0));

    foxes.add(fox);
  }

  public void addFood(String food) {

  }
}
