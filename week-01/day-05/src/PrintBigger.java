import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {
    Scanner be = new Scanner(System.in);
    int szam1 = be.nextInt();
    int szam2 = be.nextInt();
    if (szam1 > szam2) {
      System.out.println(szam1);
    } else {
      System.out.println(szam2);
    }

  }
}
