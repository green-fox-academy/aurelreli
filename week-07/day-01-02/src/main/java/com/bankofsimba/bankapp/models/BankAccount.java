package com.bankofsimba.bankapp.models;

public class BankAccount {
  private String name;
  private int balance;
  private String animalType;
  private boolean isKing;
  private String goodGuy;

  public BankAccount(String name, int balance, String animalType, String goodGuy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    isKing = false;
    this.goodGuy = goodGuy;
  }

  public BankAccount(String name, int balance, String animalType, boolean isKing, String goodGuy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.goodGuy = goodGuy;
  }

  public String getName() {
    return name;
  }

  public int getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public boolean getIsKing() {
    return isKing;
  }

  public String getGoodGuy() {
    return goodGuy;
  }
}
