package farm;

public class Main {
  public static void main(String[] args) {
    Animal zebra = new Animal("zebra");
    Animal cow = new Animal("cow");

    Farm farm = new Farm(10);
    farm.add(zebra);
    farm.add(zebra);
    farm.add(zebra);
    farm.add(zebra);
    farm.add(zebra);
    farm.add(cow);
    farm.add(cow);
    cow.eat();
    cow.eat();
    cow.eat();
    farm.breed(zebra);
    System.out.println(farm.getFreePlace());
    System.out.println(farm.getPlace());
    farm.slaughter();
    farm.slaughter();
    farm.slaughter();
    farm.slaughter();
    farm.slaughter();
    farm.slaughter();
    farm.slaughter();
    System.out.println(farm.getFreePlace());

  }
}
