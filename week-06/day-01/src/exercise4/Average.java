package exercise4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Average {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    double average = numbers.stream()
        .mapToDouble(x -> x)
        .filter(x -> !(x % 2 == 0))
        .average()
        .getAsDouble()
    ;
    System.out.println(average);
  }
}
