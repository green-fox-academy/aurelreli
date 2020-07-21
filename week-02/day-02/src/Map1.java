import java.util.HashMap;

public class Map1 {
  public static void main(String[] args) {
    HashMap<Integer, String> mymap = new HashMap<Integer, String>();
    System.out.println(mymap.isEmpty());
    mymap.put(97, "a");
    mymap.put(98, "b");
    mymap.put(99, "c");
    mymap.put(65, "A");
    mymap.put(66, "B");
    mymap.put(67, "C");
    System.out.println(mymap.keySet());
    System.out.println(mymap.values());
    mymap.put(68, "D");
    System.out.println(mymap.size());
    System.out.println(mymap.get(99));
    mymap.remove(97);
    System.out.println(mymap.containsKey(100));
    mymap.clear();
    System.out.println(mymap.keySet());
  }
}
