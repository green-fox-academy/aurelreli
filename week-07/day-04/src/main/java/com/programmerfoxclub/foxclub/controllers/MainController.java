package com.programmerfoxclub.foxclub.controllers;

import com.programmerfoxclub.foxclub.models.Fox;
import com.programmerfoxclub.foxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  private FoxService foxService;

  @Autowired
  public MainController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/")
  public String homePage(Model model, @RequestParam(required = false) String name) {
    model.addAttribute("fox", foxService.getFoxByName(name));
    return "index";
  }

  @GetMapping("/login")
  public String login(Model model, @RequestParam(required = false) String name) {
    model.addAttribute("name", name);
    return "login";
  }

  @PostMapping("/login")
  public String loginSubmit(@RequestParam String name) {
    foxService.addFox(name);
    return "redirect:/" + "?name=" +  name;
  }

  @GetMapping("/nutrition-store")
  public String nutritionStore(@RequestParam String name) {
    return "nutritionstore";
  }

  @GetMapping("/nutrition-store")
  public String nutritionStoreSubmit(@RequestParam String name) {

    return "rediredct:/" + "?name" + name;
  }
}
