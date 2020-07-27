package animal;

public class Main {
  public static void main(String[] args) {
    Animal zebra = new Animal();
    zebra.eat();
    zebra.eat();
    zebra.eat();
    zebra.drink();
    zebra.drink();
    zebra.drink();
    zebra.play();
    System.out.println(zebra.getHunger());
  }
}
