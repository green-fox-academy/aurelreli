package com.bankofsimba.bankapp.controllers;

import com.bankofsimba.bankapp.models.BankAccount;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BankAccountController {
  List<BankAccount> bankAccounts;
  String htmlception = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";


  public BankAccountController() {
    BankAccount account1 = new BankAccount("Pumbaa", 3000, "warthog", "good");
    BankAccount account2 = new BankAccount("Timon", 400, "meerkat", "good");
    BankAccount account3 = new BankAccount("Simba", 50000, "lion", true, "good");
    BankAccount account4 = new BankAccount("Rafiki", 6700, "baboon", "good");
    bankAccounts = Arrays.asList(account1, account2, account3, account4);
  }

  @GetMapping("/show")
  public String show(Model model) {
    model.addAttribute("accounts", bankAccounts);
    return "show";
  }

  @GetMapping("/htmlception")
  public String htmlceptioner(Model model) {
    model.addAttribute("htmlception", htmlception);
    return "htmlception";
  }


}
