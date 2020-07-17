import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {

    Scanner be = new Scanner(System.in);
    int sz = be.nextInt();
    if ((sz % 2) == 1) {
      System.out.println("odd");
    } else {
      System.out.println("even");
    }
  }
}
