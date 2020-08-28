package com.basicweb.webshop.controllers;

import com.basicweb.webshop.models.ShopItem;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopItemController {
  private List<ShopItem> shopItems;

  public ShopItemController() {
    ShopItem item1 =
        new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000, 5);
    ShopItem item2 = new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2);
    ShopItem item3 = new ShopItem("Coca cola", "0.5l standard coke", 25, 0);
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
    List<ShopItem> availableShopItems = shopItems.stream()
        .filter(item -> item.getQuantityOfStock() != 0)
        .collect(Collectors.toList());
    model.addAttribute("items", availableShopItems);
    return "index";
  }

  @GetMapping("/cheapest-first")
  public String getCheapestFirst(Model model) {
    List<ShopItem> cheapestShopItems = shopItems.stream()
        .sorted(Comparator.comparingInt(ShopItem::getPrice))
        .collect((Collectors.toList()));
    model.addAttribute("items", cheapestShopItems);
    return "index";
  }

  @GetMapping("/contains-nike")
  public String getContainsNike(Model model) {
    List<ShopItem> containsNike = shopItems.stream()
        .filter(x -> x.getDescription().toLowerCase().contains("nike"))
        .collect(Collectors.toList());
    model.addAttribute("items", containsNike);
    return "index";
  }

  @GetMapping("/average-stock")
  public String getAverageStock(Model model) {
    OptionalDouble averageStock = shopItems.stream()
        .mapToInt(ShopItem::getQuantityOfStock)
        .average();
    model.addAttribute("averageStock", averageStock.orElse(0));
    return "averagestock";
  }

  @GetMapping("/most-expensive-available")
  public String getMostExpensiveAvailable(Model model) {
    ShopItem mostExpensiveAvailable = shopItems.stream()
        .filter(item -> item.getQuantityOfStock() != 0)
        .sorted(Comparator.comparingInt(ShopItem::getPrice))
        .collect(Collectors.toList())
        .get(shopItems.size() - 1);
    model.addAttribute("mostExpensiveAvailable", mostExpensiveAvailable.getName());
    return "mostexpensiveavailable";
  }
}
