package com.connection.app.services;

import com.connection.app.models.Todo;
import com.connection.app.repositories.TodoRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
  private TodoRepository todoRepository;

  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public List<Todo> getTodos() {
    return todoRepository.findAll();
  }

  public List<Todo> getTodosByName(String name) {
    return todoRepository.findAll().stream()
        .filter(x -> x.getTitle().contains(name))
        .collect(Collectors.toList());
  }

  public void add(Todo todo) {
    todoRepository.save(todo);
  }
}
