package pirates;

public class Pirate {
  private String name;
  private int intoxication;
  private boolean isAlive;
  private boolean isCaptain;
  private boolean isMember;

  public Pirate(String name) {
    this.name = name;
    intoxication = 0;
    isAlive = true;
    isCaptain = false;
    isMember = false;
  }

  public void drinkSomeRum() {
    if (isAlive) {
      intoxication++;
    } else {
      System.out.println("He's fish food already, mate.");
    }
  }
  public void howItsGoingMate() {
    if (isAlive) {
      if (intoxication < 5) {
        System.out.println("Pour me anudder!");
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        intoxication = 0;
      }
    } else {
      System.out.println("He's sleeping with the fish.");
    }
  }
  public void die() {
    if (isAlive) {
      isAlive = false;
    } else {
      System.out.println("He's fish food already, mate.");
    }
  }
  public void brawl(Pirate pirate) {
    int random = (int)(Math.random() * 3) + 1;
    if (pirate.isAlive && this.isAlive) {
      switch (random) {
        case 1 :
          pirate.die();
          System.out.println("as planned");
          break;
        case 2 :
          this.die();
          System.out.println("challenger died");
          break;
        case 3 :
          pirate.die();
          this.die();
          System.out.println("both died");
          break;
      }
    } else {
      System.out.println("Ya can't brawl a dead man.");
    }
  }

  public String getName() {
    return name;
  }

  public boolean getIsalive() {
    return isAlive;
  }
  public int getIntoxication() {
    return intoxication;
  }
  public boolean getIsCaptain() {
    return isCaptain;
  }
  public void setIsCaptain() {
    isCaptain = true;
  }
  public boolean getIsMember() {
    return isMember;
  }
  public void setIsMember() {
    isMember = true;
  }
}
