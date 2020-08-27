package com.basicweb.webshop.controllers;

import com.basicweb.webshop.models.ShopItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopItemController {
  List<ShopItem> shopItemList = new ArrayList<>();
  ShopItem item1 = new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000, 5);
  ShopItem item2 = new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2);
  ShopItem item3 = new ShopItem("Coca cola", "0.5l standard coke", 25, 0 );
  ShopItem item4 = new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119, 100);
  ShopItem item5 = new ShopItem("T-shirt", "Blue with a corgi on a bike", 300, 1);
  

  @RequestMapping("/index")
  public String getShopList(Model model) {
    model.addAttribute("items", shopItemList);
    return "index";
  }


}
