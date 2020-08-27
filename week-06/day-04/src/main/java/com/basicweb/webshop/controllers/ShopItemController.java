package com.basicweb.webshop.controllers;

import com.basicweb.webshop.models.ShopItem;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopItemController {
  List<ShopItem> shopItems;

  public ShopItemController() {
    ShopItem item1 = new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000, 5);
    ShopItem item2 = new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2);
    ShopItem item3 = new ShopItem("Coca cola", "0.5l standard coke", 25, 0 );
    ShopItem item4 = new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119, 100);
    ShopItem item5 = new ShopItem("T-shirt", "Blue with a corgi on a bike", 300, 1);
    shopItems = (Arrays.asList(item1, item2, item3, item4, item5));
  }
  @GetMapping("/")
  public String getShopList(Model model) {
    model.addAttribute("items", shopItems);
    return "index";
  }

  @GetMapping("/only-available")
  public String getOnlyAvailable(Model model) {
    model.addAttribute("items", shopItems);
      List<ShopItem> availableShopItems = shopItems.stream()
          .filter(item -> item.getQuantityOfStock() != 0)
          .collect(Collectors.toList());
      ;
    model.addAttribute("items", availableShopItems);
    return "index";
  }


}
