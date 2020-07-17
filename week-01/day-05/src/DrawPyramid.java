import java.util.Scanner;

public class DrawPyramid {
  public static void main(String[] args) {
    Scanner be = new Scanner(System.in);
    int szam = be.nextInt();
    int csil;
    for (int i = 1; i <= szam; i++) {
      if (i % 2 != 0) {
        System.out.println("");
        for (int j = 1; j<= i; j++) {
          csil = ((szam-i)/2);
          for (int k=1;k<=csil;k++) {
            System.out.print(" ");
          }
          System.out.print("*");
          for (int k=1;k<=csil;k++) {
            System.out.print(" ");
          }
      }
      }
    }
  }
}
