package pirates;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
//initalizing---------------------------------------------------------------------------------------
    Pirate filthyJack = new Pirate("Filthy Jack");
    Pirate edwardTeach = new Pirate("Edward Teach");
    Pirate anneBonnie = new Pirate("Anne Bonnie");
    Pirate jackSparrow = new Pirate("Jack Sparrow");
    Pirate billTurner = new Pirate("Bill Turner");
    Pirate longJohnSilver = new Pirate("Long John Silver");
    Pirate jackReckham = new Pirate("Jack Reckham");
    Pirate elizabethSwann = new Pirate("Elizabeth Swann");
    Pirate jamesFlint = new Pirate("James Flint");
    ArrayList<Pirate> allPirates = new ArrayList<>();
    allPirates.add(filthyJack);
    allPirates.add(edwardTeach);
    allPirates.add(anneBonnie);
    allPirates.add(jackSparrow);
    allPirates.add(billTurner);
    allPirates.add(longJohnSilver);
    allPirates.add(jackReckham);
    allPirates.add(elizabethSwann);
    allPirates.add(jamesFlint);
    Ship blackPearl = new Ship("Black Pearl");
    Ship flyingDutchman = new Ship("Flying Dutchman");
//commands------------------------------------------------------------------------------------------
    System.out.println("ship1: ");
    blackPearl.fillship(allPirates);
    blackPearl.showMembers();
    filthyJack.drinkSomeRum();
    blackPearl.stateOfShip();
    System.out.println("ship2: ");
    flyingDutchman.fillship(allPirates);
    flyingDutchman.showMembers();
    System.out.println(blackPearl.battle(flyingDutchman));

//test----------------------------------------------------------------------------------------------

//    filthyJack.drinkSomeRum();
//    filthyJack.drinkSomeRum();
//    filthyJack.drinkSomeRum();
//    filthyJack.drinkSomeRum();
//    filthyJack.drinkSomeRum();
//    filthyJack.howItsGoingMate();
//    filthyJack.howItsGoingMate();
//    filthyJack.brawl(captainEdward);
//    filthyJack.brawl(captainEdward);
//    filthyJack.drinkSomeRum();
//    captainEdward.drinkSomeRum();

  }
}
