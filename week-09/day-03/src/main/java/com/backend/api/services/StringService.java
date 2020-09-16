package com.backend.api.services;

import com.backend.api.repositories.StringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StringService {

  private StringRepository stringRepository;

  @Autowired
  public StringService (StringRepository stringRepository) {
    this.stringRepository = stringRepository;
  }

}
