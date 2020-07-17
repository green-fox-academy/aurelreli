import java.util.Scanner;

public class CountFromTo {
  public static void main(String[] args) {
    Scanner be = new Scanner(System.in);
    int szam1, szam2;
    System.out.println("First Number:");
    szam1 = be.nextInt();
    System.out.println("Second Number:");
    szam2 = be.nextInt();
    if (szam1>szam2) {
      System.out.println("Second Number Should be bigger");
    } else {
      for (int i = szam1; i < szam2; i++) {
        System.out.println(i);
      }
    }
  }
}
