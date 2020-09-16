package com.api.frontend.controllers;

import com.api.frontend.models.Append;
import com.api.frontend.models.ArraysInput;
import com.api.frontend.models.DoubleArray;
import com.api.frontend.models.Doubled;
import com.api.frontend.models.ErrorMessage;
import com.api.frontend.models.Factor;
import com.api.frontend.models.MultiplyArray;
import com.api.frontend.models.NumberUntil;
import com.api.frontend.models.Sum;
import com.api.frontend.models.SumArray;
import com.api.frontend.models.WelcomeMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiscController {

  @GetMapping("/doubling")
  public ResponseEntity doubleInput(@RequestParam(required = false) Integer input) {
    if (input == null) {
      return ResponseEntity.ok(new ErrorMessage("Please provide an input!"));
    }
    return ResponseEntity.status(HttpStatus.OK).body(new Doubled(input));
  }

  @GetMapping("/greeter")
  public ResponseEntity greet(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
    if ((name == null) && (title == null)) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessage("Please provide a name and a title!"));
    }
    if (name == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessage("Please provide a name!"));
    }
    if (title == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessage("Please provide a title!"));
    }
    return ResponseEntity.status(HttpStatus.OK).body(new WelcomeMessage(name, title));
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity appendA(@PathVariable String appendable) {
    return ResponseEntity.ok(new Append(appendable));
  }

  @PostMapping("/dountil/{action}")
  public ResponseEntity dountil(@PathVariable String action, @RequestBody(required = false)
      NumberUntil until) {
    if (until == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessage("Please provide a number!"));
    }
    if (action.equals("sum")) {
      return ResponseEntity.ok(new Sum(until.getUntil()));
    } else if (action.equals("factor")) {
      return ResponseEntity.ok(new Factor(until.getUntil()));
    }
    return ResponseEntity.ok(new ErrorMessage("Something is wrong."));
  }

  @PostMapping("/arrays")
  public ResponseEntity arrays(@RequestBody ArraysInput input) {
    if ((input.getWhat() == null) || (input.getNumbers() == null)) {
      return ResponseEntity.ok(new ErrorMessage("Please provide what to do with the numbers!"));
    }
    switch (input.getWhat()) {
      case "sum" :
        return ResponseEntity.ok(new SumArray(input.getNumbers()));
      case "multiply" :
        return ResponseEntity.ok(new MultiplyArray(input.getNumbers()));
      case "double" :
        return ResponseEntity.ok(new DoubleArray(input.getNumbers()));
    }
    return ResponseEntity.ok(new ErrorMessage("Something is wrong."));
  }
}
