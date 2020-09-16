package com.backend.api.repositories;

import com.backend.api.models.SithText;
import org.springframework.data.repository.CrudRepository;

public interface StringRepository extends CrudRepository<SithText, String> {
}
