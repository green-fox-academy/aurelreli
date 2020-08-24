package exercise9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Freq {
  public static void main(String[] args) {
    String string = "Kutyamajom";
    List<Character> list = new ArrayList<>();
    for (char c : string.toCharArray()) {
      list.add(c);
    }
    Map<Character, Integer> frequency = list.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(x -> 1)));
    System.out.println(frequency);
  }
}
