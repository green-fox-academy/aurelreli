import java.util.Scanner;

public class FirstException {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int divisor = sc.nextInt();
    try {
      int result = 12 / divisor; // If the input value for divisor was 0 the program breaks
      System.out.println(result); // The program doesn't reach this line if the input was 0
    } catch (ArithmeticException e) {
      System.out.println("Fail");
    }

  }
}
