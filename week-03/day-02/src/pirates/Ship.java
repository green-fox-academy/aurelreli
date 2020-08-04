package pirates;

import java.util.ArrayList;

public class Ship {
  private String shipName;
  ArrayList<Pirate> ship = new ArrayList<>();

  public Ship(String shipName) {
    this.shipName = shipName;
  }

  public void stateOfShip() {
    int counter = 0;
    for (int i = 0; i < ship.size(); i++) {
      if (ship.get(i).getIsCaptain() && ship.get(i).getIntoxication() > 0) {
        System.out.println("Captain's drunk!");
      }
      if (ship.get(i).getIsalive()) {
        counter++;
      }
    }
    System.out.println("Mates alive: " + counter);
  }
  public void fillship(ArrayList<Pirate> allPirates) {
    for (int i = 0; i < (int) (Math.random() * 9) + 1; i++) {
      if (!(allPirates.get(i).getIsMember())) {
        ship.add(allPirates.get(i));
        allPirates.get(i).setIsMember();
      }
    }
    try {
      ship.get((int) (Math.random() * (ship.size()))).setIsCaptain();
    } catch (Exception e) {
      System.out.println("Ship is empty!");
    }

  }
  public void showMembers() {
    for (int i = 0; i < ship.size(); i++) {
      System.out.println(ship.get(i).getName());
    }
    for (int i = 0; i < ship.size(); i++) {
      if (ship.get(i).getIsCaptain()) {
        System.out.println(ship.get(i).getName() + " is the  captain");
      }
    }
  }
  public boolean battle(Ship ship) {
    int ship1 = 0;
    int ship2 = 0;
    boolean win;
//ship1 calc
    for (int i = 0; i < this.ship.size(); i++) {
      if (this.ship.get(i).getIsalive()) {
        ship1++;
      }
      if (this.ship.get(i).getIsCaptain()) {
        for (int j = 0; j < this.ship.get(i).getIntoxication(); j++) {
          ship1--;
        }
      }
    }
//ship2 calc
    for (int i = 0; i < ship.getSize(); i++) {
      if (ship.getIndex(i).getIsalive()) {
        ship2++;
      }
      if (ship.getIndex(i).getIsCaptain()) {
        for (int j = 0; j < ship.getIndex(i).getIntoxication(); j++) {
          ship2--;
        }
      }
    }
    win = (ship1 > ship2);
//losses
    if (win) {
      for (int i = 0; i < (int) (Math.random() * ship.getSize()) + 1; i++) {
        ship.getIndex(i).die();
      }
    } else {
      for (int i = 0; i < (int) (Math.random() * this.ship.size()) + 1; i++) {
        this.ship.get(i).die();
      }
    }
  return win;
  }
  public Pirate getIndex(int i) {
    return ship.get(i);
  }
  public int getSize() {
    return ship.size();
  }

}
