package exercise3;

import java.util.Arrays;
import java.util.List;

public class SquaredMore {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
    numbers.stream()
        .map(number -> square(number))
        .filter(x -> x > 20)
        .map(number -> (int)Math.sqrt(number))
        .forEach(System.out::println);
    ;
  }
  public static int square(int a) {
    return a * a;
  }
}
