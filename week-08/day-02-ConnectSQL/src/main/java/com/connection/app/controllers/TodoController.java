package com.connection.app.controllers;

import com.connection.app.models.Todo;
import com.connection.app.repositories.TodoRepository;
import com.connection.app.services.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoController {

  private TodoService todoService;

  @Autowired
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping("/todo")
  public String todo() {
    return "todo";
  }

  @GetMapping({"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", todoService.getTodos());
    return "todolist";
  }

  @PostMapping({"/", "/list"})
  public String search(Model model, String search) {
    model.addAttribute("todos", todoService.getTodosByName(search));
    return "todolist";
  }
}
