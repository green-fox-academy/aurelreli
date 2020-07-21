import java.util.HashMap;

public class Product {
  public static void main(String[] args) {
    HashMap<String, Integer> prices = new HashMap<String, Integer>();
    prices.put("Eggs", 200);
    prices.put("Milk", 200);
    prices.put("Fish", 400);
    prices.put("Apples", 150);
    prices.put("Bread", 50);
    prices.put("Chicken", 550);
    System.out.println(prices.get("Fish"));
    int max = 0;
    for (String i : prices.keySet()) {
      if (max < prices.get(i)) {
        max = prices.get(i);
      }
    }
    System.out.println(max);
    double sum = 0;
    for (String i : prices.keySet()) {
      sum = sum + prices.get(i);
    }
    double avg = (sum/prices.size());
    System.out.println(avg);
    int howmany = 0;
    for (String i : prices.keySet()) {
      if (prices.get(i) < 300) {
        howmany++;
      }
    }
    System.out.println(howmany);
    boolean isthere = false;
    for (String i : prices.keySet()) {
      if (prices.get(i) == 125) {
        isthere = true;
      }
    }
    System.out.println(isthere);
    int min = max;
    for (String i : prices.keySet()) {
      if (min > prices.get(i)) {
        min = prices.get(i);
      }
    }
    System.out.println(min);
  }
}
