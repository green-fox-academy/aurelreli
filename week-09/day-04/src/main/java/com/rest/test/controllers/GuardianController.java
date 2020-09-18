package com.rest.test.controllers;

import com.rest.test.models.Arrow;
import com.rest.test.models.CalorieTable;
import com.rest.test.models.ErrorMessage;
import com.rest.test.models.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  private CalorieTable calorieTable = new CalorieTable();

  @GetMapping("/groot")
  public ResponseEntity groot(@RequestParam(required = false) String message) {
    if (message == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessage("I am Groot!"));
    }
    return ResponseEntity.ok(new Message(message));
  }

  @GetMapping("/yondu")
  public ResponseEntity yondu(@RequestParam(required = false) Double distance,
                              @RequestParam(required = false) Double time) {
    if ((distance == null) || (time == null)) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new ErrorMessage("Parameters not provided."));
    }
    return ResponseEntity.ok(new Arrow(distance, time));
  }

  @GetMapping("/drax")
  public ResponseEntity listDrax() {
    return ResponseEntity.ok(calorieTable);
  }

  @PostMapping("/drax/add")
  public ResponseEntity addFood(@RequestParam(required = false) String name,
                                @RequestParam(required = false) int amount,
                                @RequestParam(required = false) int calorie) {
    calorieTable.addFood(name, amount, calorie);
    return ResponseEntity.ok(calorieTable);
  }

  @PostMapping("/drax/remove")
  public ResponseEntity removeFood(@RequestParam(required = false) String name) {
    calorieTable.removeFood(name);
    return ResponseEntity.ok(calorieTable);
  }

  @PostMapping("/drax/modify")
  public ResponseEntity modifyAmount(@RequestParam(required = false) String name, @RequestParam(required = false) int amount) {
    calorieTable.modifyAmount(name, amount);
    return ResponseEntity.ok(calorieTable);
  }
}