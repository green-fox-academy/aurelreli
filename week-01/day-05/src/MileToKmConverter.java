
import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    Scanner be = new Scanner(System.in);
    double mile = be.nextDouble();
    double km = (mile * 1.609344);

    System.out.println(mile + " miles" + " = " + km + " kms");
  }
}
