package com.webapplication.dependencies.color;

import org.springframework.stereotype.Service;

public class BlueColor implements MyColor{

  @Override
  public void printColor() {
    System.out.println("it is blue");
  }
}
