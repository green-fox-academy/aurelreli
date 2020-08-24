package exercise7;

import java.util.Arrays;
import java.util.List;

public class StartsWith {
  public static void main(String[] args) {
    List<String> cities = Arrays
        .asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
    Character c = 'R';
    cities.stream()
        .filter(x -> x.startsWith(c.toString()))
        .forEach(System.out::println)
    ;
  }
}
