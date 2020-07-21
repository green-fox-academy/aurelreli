import java.util.HashMap;

public class Product2 {
  public static void main(String[] args) {
    HashMap<String, Integer> prices = new HashMap<String, Integer>();
    prices.put("Eggs", 200);
    prices.put("Milk", 200);
    prices.put("Fish", 400);
    prices.put("Apples", 150);
    prices.put("Bread", 50);
    prices.put("Chicken", 550);
    for (String i : prices.keySet()) {
      if (prices.get(i) < 201) {
        System.out.println(i);
      }
    }
    for (String i : prices.keySet()) {
      if (prices.get(i) > 150) {
        System.out.println(i + ": " + prices.get(i));
      }
    }
  }
}
