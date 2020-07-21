import java.util.ArrayList;

public class List2 {
  public static void main(String[] args) {
    ArrayList<String> listA = new ArrayList<String>();
    listA.add("Apple");
    listA.add("Avocado");
    listA.add("Blueberries");
    listA.add("Durian");
    listA.add("Lychee");
    ArrayList<String> listB = new ArrayList<String>(listA);
    System.out.println(listA.contains("Durian"));
    listB.remove("Durian");
    listA.add(4, "Kiwifruit");
    System.out.println(listA.size() + " - " + listB.size());
    System.out.println(listA.indexOf("Avocado"));
    System.out.println(listB.indexOf("Durian"));
    listB.add("Passion Fruit" + "Pomelo");
    System.out.println(listA.get(2));
  }
}
