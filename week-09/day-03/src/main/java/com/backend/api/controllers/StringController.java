package com.backend.api.controllers;

import com.backend.api.models.ErrorMessage;
import com.backend.api.models.InputText;
import com.backend.api.models.SithText;
import com.backend.api.services.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

  private StringService stringService;

  @Autowired
  public StringController(StringService stringService) {
    this.stringService = stringService;
  }

  @PostMapping("/sith")
  public ResponseEntity sith(@RequestBody(required = false) InputText text) {
    if (text == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new ErrorMessage("Feed me some text you have to, padawan young you are. Hmmm."));
    }
    return ResponseEntity.ok(new SithText(text.getText()));
  }

}
