package com.api.frontend.models;

public class ArraysInput {
  private String what;
  private int[] numbers;
  private int result;

  public ArraysInput() {
  }

  public ArraysInput(String what, int[] numbers) {
    this.what = what;
    this.numbers = numbers;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }

  public int sumNumbers() {
    numbers = getNumbers();
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    return sum;
  }

  public int multiplyNumbers() {
    numbers = getNumbers();
    int result = 1;
    for (int i = 0; i < numbers.length; i++) {
      result *= numbers[i];
    }
    return result;
  }

  public int[] doubleNumbers() {
    numbers = getNumbers();
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = numbers[i] * 2;
    }
    return numbers;
  }
}
