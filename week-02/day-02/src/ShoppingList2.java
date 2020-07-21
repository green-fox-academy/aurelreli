import java.util.HashMap;

public class ShoppingList2 {
  public static void main(String[] args) {
    HashMap<String, Double> prices = new HashMap<String, Double>();
    prices.put("Milk", 1.07);
    prices.put("Rice", 1.59);
    prices.put("Eggs", 3.14);
    prices.put("Cheese", 12.60);
    prices.put("Chicken Breasts", 9.40);
    prices.put("Apples", 2.31);
    prices.put("Tomato", 2.58);
    prices.put("Potato", 1.75);
    prices.put("Onion", 1.10);
    HashMap<String, Integer> bob = new HashMap<String, Integer>();
    bob.put("Milk", 3);
    bob.put("Rice", 2);
    bob.put("Eggs", 2);
    bob.put("Cheese", 1);
    bob.put("Chicken Breasts", 4);
    bob.put("Apples", 1);
    bob.put("Tomato", 2);
    bob.put("Potato", 1);
    HashMap<String, Integer> alice = new HashMap<String, Integer>();
    alice.put("Rice", 1);
    alice.put("Eggs", 5);
    alice.put("Chicken Breasts", 2);
    alice.put("Apples", 1);
    alice.put("Tomato", 10);

    double bobsum = 0;
    for (String i : prices.keySet()) {
      for (String j : bob.keySet()) {
        if (i == j) {
          bobsum = bobsum + (prices.get(i) * bob.get(j));
        }
      }
    }
    System.out.println(bobsum);

    double alicesum = 0;
    for (String i : prices.keySet()) {
      for (String j : alice.keySet()) {
        if (i == j) {
          alicesum = alicesum + (prices.get(i) * alice.get(j));
        }
      }
    }
    System.out.println(alicesum);

    if (bob.get("Rice") > alice.get("Rice")) {
      System.out.println("bob has more rice");
    } else {
      System.out.println("alice has more rice");
    }

    //if (bob.get("Potato") > alice.get("Potato")) {
    //  System.out.println("bob has more potatoes");
    //} else {
    //  System.out.println("alice has more potatoes");
    //}

    if (bob.size() > alice.size()) {
      System.out.println("bob does");
    } else {
      System.out.println("alice does");
    }

    int bobprod = 0;
    for (String i : bob.keySet()) {
      bobprod = bobprod + 1;
    }
    int aliceprod = 0;
    for (String i : alice.keySet()) {
      aliceprod = aliceprod + 1;
    }
    if (bobprod > aliceprod) {
      System.out.println("bob");
    } else {
      System.out.println("alice");
    }
  }
}
