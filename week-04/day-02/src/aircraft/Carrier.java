package aircraft;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
  private List<Aircraft> aircrafts;
  private int ammoStored;
  private int hp;

  public Carrier(int initAmmo, int hp) {
    this.hp = hp;
    ammoStored = initAmmo;
    aircrafts = new ArrayList<>();
  }
  public void add(Aircraft aircraft) {
    aircrafts.add(aircraft);
  }
  public void fill() {
    int ammoNeeded = 0;
    for (Aircraft aircraft : aircrafts) {
      ammoNeeded = ammoNeeded + (aircraft.getMaxAmmo()-aircraft.getAmmo());
    }
    try {
      if (ammoNeeded > ammoStored) {
        for (Aircraft aircraft : aircrafts) {
          if (aircraft.isPriority()) {
            aircraft.refill(ammoStored);
            ammoNeeded = ammoNeeded - aircraft.refill(ammoStored);
            ammoStored = ammoStored - aircraft.refill(ammoStored);
          }
        }
        for (Aircraft aircraft : aircrafts) {
          aircraft.refill(ammoStored);
          ammoNeeded = ammoNeeded - aircraft.refill(ammoStored);
          ammoStored = ammoStored - aircraft.refill(ammoStored);
        }
      }
    } catch (Exception e) {
      System.out.println("No ammo on the carrier!");
    }
  }
  public void fight(Carrier carrier) {
    for (Aircraft aircraft : aircrafts) {
      carrier.setHp(-1 * (aircraft.fight()));
    }
  }
  public void setHp(int hp) {
    this.hp = this.hp + hp;
  }
}
