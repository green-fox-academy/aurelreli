package com.greenfoxacademy.springstart.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {


//  @RequestMapping(path = "/greeting")
//  public Greeting greeting() {
//    return new Greeting(1, "Hello World!");
//  }

//  @RequestMapping(value = "/greeting")
//  public Greeting greeting(@RequestParam String name) {
//    return new Greeting(1, "Hello " + name);
//  }

  AtomicLong counter = new AtomicLong();
  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam String name) {
    return new Greeting(1, "Hello " + name, counter.incrementAndGet());
  }

}
