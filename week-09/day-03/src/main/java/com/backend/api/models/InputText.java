package com.backend.api.models;

public class InputText {
  private String text;

  public InputText() {}

  public InputText(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
