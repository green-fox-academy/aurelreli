package com.api.frontend.models;

public class MultiplyArray {
  private int result;

  public MultiplyArray(){}

  public MultiplyArray(int[] array) {
    result = 1;
    for (int i = 0; i < array.length; i++) {
      result *= array[i];
    }
  }

  public int getResult() {
    return result;
  }
}
