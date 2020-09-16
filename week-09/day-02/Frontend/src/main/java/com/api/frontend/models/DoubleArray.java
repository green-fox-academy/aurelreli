package com.api.frontend.models;

public class DoubleArray {
  private int[] result;

  public DoubleArray() {}

  public DoubleArray(int[] array) {
    result = array;
    for (int i = 0; i < array.length; i++) {
      result[i] = array[i] * 2;
    }
  }

  public int[] getResult() {
    return result;
  }
}
