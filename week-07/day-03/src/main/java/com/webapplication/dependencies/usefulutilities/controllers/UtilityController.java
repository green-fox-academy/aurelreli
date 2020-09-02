package com.webapplication.dependencies.usefulutilities.controllers;

import com.webapplication.dependencies.usefulutilities.service.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {

  @GetMapping("/useful")
  public String mainPage() {
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String coloredPage(Model model, UtilityService utilityService) {
    model.addAttribute("color", utilityService.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String emailValidator(Model model, Model model2, UtilityService utilityService, @RequestParam String param) {
    model.addAttribute("ecolor", utilityService.emailCheck(param));
    model2.addAttribute("emailAdress", param);
    return "email";
  }
}
