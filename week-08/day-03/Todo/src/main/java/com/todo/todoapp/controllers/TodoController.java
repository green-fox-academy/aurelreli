package com.todo.todoapp.controllers;

import com.todo.todoapp.services.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class TodoController {

  private TodoService todoService;

//  @Autowired
//  public TodoController(TodoService todoService) {
//    this.todoService = todoService;
//    todoService.save(new Todo("buy milk"));
//    todoService.save(new Todo("buy bread"));
//  }

  @GetMapping("/todo")
  public String todo() {
    return "todo";
  }

  @GetMapping({"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", todoService.getTodos());
    return "todolist";
  }
}
