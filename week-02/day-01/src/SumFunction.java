public class SumFunction {
  // Create the usual class wrapper and main method on your own.

  // Write a function called `sum` that returns the sum of numbers from zero to the given parameter
  public static void main(String[] args) {
    int number = 4;
    System.out.println(sum(number));

  }
  public static int sum(int in) {
    int summa = 0;
    for (int i = 0; i <= in; i++) {
      summa = summa + i;
    }
    return summa;
  }
}
