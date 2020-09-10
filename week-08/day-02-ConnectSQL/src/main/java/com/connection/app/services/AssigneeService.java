package com.connection.app.services;

import com.connection.app.models.Assignee;
import com.connection.app.repositories.AssigneeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssigneeService {
  private AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeService(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  public List<Assignee> getAssignees() {
    return assigneeRepository.findAll();
  }

  public void add(Assignee assignee) {
    assigneeRepository.save(assignee);
  }
}
