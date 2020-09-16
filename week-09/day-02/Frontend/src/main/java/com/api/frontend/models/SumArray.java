package com.api.frontend.models;

public class SumArray {
  private int result;

  public SumArray() {
  }
  public SumArray(int[] array) {
    result = 0;
    for (int i = 0; i < array.length; i++) {
      result += array[i];
    }
  }

  public int getResult() {
    return result;
  }
}
