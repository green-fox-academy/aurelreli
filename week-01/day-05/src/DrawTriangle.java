import java.util.Scanner;

public class DrawTriangle {
  public static void main(String[] args) {
    Scanner be = new Scanner(System.in);
    int szam = be.nextInt();
    for (int i = 1; i <= szam; i++) {
      System.out.println("");
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
    }
  }
}
