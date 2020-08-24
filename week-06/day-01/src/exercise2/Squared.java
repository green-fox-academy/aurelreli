package exercise2;

import java.util.Arrays;
import java.util.List;

public class Squared {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    numbers.stream()
        .map(number -> square(number))
        .forEach(System.out::println)
    ;
  }
  public static int square(int a) {
    return a * a;
  }
}
