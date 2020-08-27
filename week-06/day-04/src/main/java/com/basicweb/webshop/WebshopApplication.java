package com.basicweb.webshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class WebshopApplication {

  public static void main(String[] args) {
    SpringApplication.run(WebshopApplication.class, args);
  }

  @RequestMapping(value="/")
  @ResponseBody
  public String hello() {
    return "Hello World!";
  }

}

