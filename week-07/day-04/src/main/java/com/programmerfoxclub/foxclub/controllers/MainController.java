package com.programmerfoxclub.foxclub.controllers;

import com.programmerfoxclub.foxclub.models.Fox;
import com.programmerfoxclub.foxclub.services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  Fox fox;

  @GetMapping("/")
  public String homePage(Model model, @RequestParam(required = false) String name) {
    model.addAttribute("name", name);
    model.addAttribute("food", fox.getFood());
    model.addAttribute("drink", fox.getDrink());
    model.addAttribute("tricks", fox.getTricks());
    return "index";
  }

  @GetMapping("/login")
  public String login(Model model, @RequestParam(required = false) String name) {
    model.addAttribute("name", name);
    return "login";
  }

  @PostMapping("/login")
  public String loginSubmit(Model model, @RequestParam String name) {
    model.addAttribute("name", name);
    return "redirect:/" + "?name=" +  name;
  }
}
