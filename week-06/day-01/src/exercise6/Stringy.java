package exercise6;

import java.util.ArrayList;
import java.util.List;

public class Stringy {
  public static void main(String[] args) {
    String string = "beLIEve";
    List<Character> list = new ArrayList<>();
    for (Character character : string.toCharArray()) {
      list.add(character);
    }
    list.stream()
      .filter(x -> Character.isUpperCase(x))
      .forEach(System.out::print);
    ;
  }
}
