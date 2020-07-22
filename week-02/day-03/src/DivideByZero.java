import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
    divide();
  }
  public static void divide() {
    Scanner sc = new Scanner(System.in);
    int divisor = sc.nextInt();
    try {
      int result = 10 / divisor;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("cannot divide by zero");
    }
  }
}
