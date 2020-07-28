package farm;

import java.util.ArrayList;

public class Farm {
  private int place;
  private int freePlace;
  ArrayList<Animal> farm = new ArrayList<>();

  public Farm(int place) {
    this.place = place;
    this.freePlace = place;
  }
  public void add(Animal animal) {
    farm.add(animal);
    this.freePlace--;
  }
  public void breed(Animal animal) {
    if (freePlace < place) {
      farm.add(animal);
      freePlace--;
    }
  }
  public void slaughter() {
    int food = 0;
    for (int i = 0; i < farm.size()-getFreePlace(); i++) {
      if (farm.get(i).getHunger() > food) {
        food = i;
      }
    }
    farm.remove(food);
    freePlace++;
    System.out.println(farm.get(food).getName() + " slaughtered");
  }

  public int getFreePlace() {
    return freePlace;
  }
  public int getPlace() {
    return place;
  }
}
