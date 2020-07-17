import java.util.Scanner;

public class PartyIndicator {
  public static void main(String[] args) {
    Scanner be = new Scanner(System.in);
    int girls, boys;
    System.out.println("Girls:");
    girls = be.nextInt();
    System.out.println("Boys");
    boys = be.nextInt();
    if ((boys == girls) && ((boys + girls) >= 20)) {
      System.out.println("excellent party!");
    } else if ((boys != girls) && ((boys + girls) >= 20) && (girls !=0)) {
      System.out.println("quite cool party");
    } else if ((boys + girls) < 20) {
      System.out.println("average party");
    } else if (girls == 0) {
      System.out.println("sausage party");
    }
  }
}
