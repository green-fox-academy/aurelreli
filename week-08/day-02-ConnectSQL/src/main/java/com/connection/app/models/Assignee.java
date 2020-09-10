package com.connection.app.models;

public class Assignee {
  private String name;
  private String email;

  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }
}
