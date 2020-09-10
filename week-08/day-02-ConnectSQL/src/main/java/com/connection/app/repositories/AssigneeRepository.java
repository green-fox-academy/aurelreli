package com.connection.app.repositories;

import com.connection.app.models.Assignee;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, String> {
  List<Assignee> findAll();
}
