package com.api.frontend.models;

public class Doubled {
  private int received;
  private int result;

  public Doubled(int input) {
    this.received = input;
    this.result = input * 2;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
