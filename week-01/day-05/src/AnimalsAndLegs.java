import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        int chick, pig, chickleg, pigleg;
        Scanner be = new Scanner(System.in);
        System.out.println("csirkék száma:");
        chick = be.nextInt();
        System.out.println("malacok száma:");
        pig = be.nextInt();
        chickleg = chick*2;
        pigleg = pig*4;
        System.out.println("lábak száma: " + (chickleg+pigleg));
    }
}
