package com.todoh2.todoapp;

import com.todoh2.todoapp.models.Todo;
import com.todoh2.todoapp.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoappApplication implements CommandLineRunner {

  private TodoRepository todoRepository;

  @Autowired
  public TodoappApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }


  public static void main(String[] args) {
    SpringApplication.run(TodoappApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("buy x"));
    todoRepository.save(new Todo("do y"));
    todoRepository.save(new Todo("get z"));
  }
}
