package com.api.frontend.models;

public class Factor {
  private int result;

  public Factor(int until) {
    this.result = 1;
    for (int i = 1; i < until + 1; i++) {
      this.result = this.result * i;
    }
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
