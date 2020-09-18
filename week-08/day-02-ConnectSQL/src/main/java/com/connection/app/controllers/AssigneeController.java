package com.connection.app.controllers;

import com.connection.app.models.Assignee;
import com.connection.app.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AssigneeController {

  private AssigneeService assigneeService;

  @Autowired
  public AssigneeController(AssigneeService assigneeService) {
    this.assigneeService = assigneeService;
  }

  @GetMapping("/assigneelist")
  public String listAssignees(Model model) {
    model.addAttribute("assignees", assigneeService.getAssignees());
    return "assigneelist";
  }

  @PostMapping("/assigneelist")
  public String addAssignee(Model model, String name, String email) {
    assigneeService.add(name, email);
    model.addAttribute("assignees", assigneeService.getAssignees());
    return "redirect:/assigneelist";
  }

  @GetMapping("/remove/{id}")
  public String removeAssignee(Model model,@PathVariable int id) {
    assigneeService.remove(id);
    return "redirect:/assigneelist";
  }
}
