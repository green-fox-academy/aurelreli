package com.webapplication.dependencies;

import com.webapplication.dependencies.color.BlueColor;
import com.webapplication.dependencies.color.MyColor;
import com.webapplication.dependencies.helloworld.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependenciesApplication implements CommandLineRunner {

//  Printer printer;
  MyColor myColor;

  @Autowired
  public DependenciesApplication(MyColor myColor) {
    this.myColor = myColor;
  }

//  @Autowired
//  public DependenciesApplication(Printer printer) {
//    this.printer = printer;
//  }

  public static void main(String[] args) {
    SpringApplication.run(DependenciesApplication.class, args);
  }

//  @Override
//  public void run(String... args) throws Exception {
//    printer.log("Hello world!");
//  }

  @Override
  public void run(String... args) throws Exception {
    myColor.printColor();
  }


}
