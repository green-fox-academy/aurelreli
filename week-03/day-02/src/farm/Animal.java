package farm;

public class Animal {
  private int hunger;
  private int thirst;
  private int defaults = 10;
  private String name;

  public Animal(int hunger, int thirst) {
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public void eat() {
    hunger--;
  }
  public void drink() {
    thirst--;
  }
  public void play() {
    hunger++;
    thirst++;
  }
  public Animal(String name) {
    this.hunger = defaults;
    this.name = name;
  }
  public String getName() {
    return this.name;
  }
  public int getHunger() {
    return hunger;
  }

  public int getThirst() {
    return thirst;
  }
}
