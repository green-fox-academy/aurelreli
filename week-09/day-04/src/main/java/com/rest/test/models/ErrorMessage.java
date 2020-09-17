package com.rest.test.models;

public class ErrorMessage {
  private String error;

  public ErrorMessage() {}

  public ErrorMessage(String message) {
    this.error = message;
  }

  public String getError() {
    return error;
  }
}
