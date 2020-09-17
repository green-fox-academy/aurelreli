package com.rest.test.models;

public class Message {
  private String received;
  private String translated;

  public Message() {}

  public Message(String received) {
    this.received = received;
    this.translated = "I am Groot!";
  }

  public String getReceived() {
    return received;
  }

  public String getTranslated() {
    return translated;
  }
}
