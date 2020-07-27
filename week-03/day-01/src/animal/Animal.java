package animal;

public class Animal {
  private int hunger;
  private int thirst;
  private int defaults = 50;

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
  public Animal() {
    this.hunger = defaults;
  }
  public int getHunger() {
    return hunger;
  }

  public int getThirst() {
    return thirst;
  }
}
