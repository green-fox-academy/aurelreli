package com.todo.todoapp.services;

import com.todo.todoapp.models.Todo;
import com.todo.todoapp.repositories.TodoRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TodoService {

  TodoRepository todoRepository;

  public List<Todo> getTodos() {
    return todoRepository.findAll();
  }
}
