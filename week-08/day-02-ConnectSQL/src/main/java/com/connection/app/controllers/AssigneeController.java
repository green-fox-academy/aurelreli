package com.connection.app.controllers;

import com.connection.app.models.Assignee;
import com.connection.app.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AssigneeController {

  private AssigneeService assigneeService;

  @Autowired
  public AssigneeController(AssigneeService assigneeService) {
    this.assigneeService = assigneeService;
    assigneeService.add(new Assignee("joe", "jonagy@gmail.com"));
  }

  @GetMapping("/assigneelist")
  public String listAssignees(Model model) {
    model.addAttribute("assignees", assigneeService.getAssignees());
    return "assigneelist";
  }
}
