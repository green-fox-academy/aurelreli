import java.util.Scanner;

public class OneTwoALot {
  public static void main(String[] args) {
    Scanner be = new Scanner(System.in);
    int szam = be.nextInt();
    if (szam < 1) {
      System.out.println("not enough");
    } else if (szam == 1) {
      System.out.println("one");
    } else if (szam == 2) {
      System.out.println("two");
    } else {
      System.out.println("a lot");
    }
  }
}
