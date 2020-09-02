package com.webapplication.dependencies.color;

import com.webapplication.dependencies.helloworld.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor{
  Printer printer;

  @Autowired
  public RedColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("it is red");
  }
}
