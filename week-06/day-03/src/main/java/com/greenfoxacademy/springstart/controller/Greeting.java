package com.greenfoxacademy.springstart.controller;

public class Greeting {
  private long id;
  private String content;
  private long counter;

  public Greeting(long id, String content, long counter) {
    this.id = id;
    this.content = content;
    this.counter = counter;
  }

  public String getContent() {
    return content;
  }

  public long getId() {
    return id;
  }

  public long getCounter() {
    return counter;
  }
}
