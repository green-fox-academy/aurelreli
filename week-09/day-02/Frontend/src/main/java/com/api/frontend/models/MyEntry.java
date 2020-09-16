package com.api.frontend.models;

import java.util.Date;

public class MyEntry {

  private int id;
  private String endpoint;
  private String data;
  private Date date;

  public MyEntry() {}

  public MyEntry(String endpoint, String data) {
    this.endpoint = endpoint;
    this.data = data;
    date = new Date();
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}
