package main.java.music;

public class StringedInstrument  extends Instrument{
  public int numberOfStrings;

  public String sound(){
    return null;
  }

  @Override
  public void play() {
    System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
  }
}
