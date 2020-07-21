import java.util.ArrayList;

public class ShoppingList {
  public static void main(String[] args) {
    ArrayList<String> shopList = new ArrayList<String>();
    shopList.add("eggs");
    shopList.add("milk");
    shopList.add("fish");
    shopList.add("apples");
    shopList.add("bread");
    shopList.add("chicken");
    System.out.println(shopList.contains("milk"));
    System.out.println(shopList.contains("bananas"));
  }
}
