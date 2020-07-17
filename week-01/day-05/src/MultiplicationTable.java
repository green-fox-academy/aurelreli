import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner be = new Scanner(System.in);
    int szam = be.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println(i + " * " + szam + " = " + (i * szam));
    }
  }
}
