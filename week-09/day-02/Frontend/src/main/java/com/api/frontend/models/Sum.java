package com.api.frontend.models;

public class Sum {
  private int result;

  public Sum(int until) {
    this.result = 0;
    for (int i = 0; i < until + 1; i++) {
      this.result = this.result + i;
    }
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
