package com.todoh2.todoapp.controllers;

import com.todoh2.todoapp.models.Todo;
import com.todoh2.todoapp.repositories.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.expression.Lists;

@Controller
public class TodoController {

  private TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
//    todoRepository.save(new Todo("buy milk"));
//    todoRepository.save(new Todo("buy bread"));
  }

  @GetMapping("/todo")
  public String todo() {
    return "todo";
  }

  @GetMapping({"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }
}
