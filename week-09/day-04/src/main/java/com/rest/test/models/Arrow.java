package com.rest.test.models;

public class Arrow {
  private double distance;
  private double time;
  private double speed;

  public Arrow(){}

  public Arrow(double distance, double time) {
    this.distance = distance;
    this.time = time;
    speed = distance/time;
  }

  public double getDistance() {
    return distance;
  }

  public double getTime() {
    return time;
  }

  public double getSpeed() {
    return speed;
  }
}
