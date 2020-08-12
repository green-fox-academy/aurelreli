package main.java.music;

public class Violin extends StringedInstrument{

  public Violin(){
    name = "Violin";
    numberOfStrings = 4;
  }
  public Violin(int numberOfStrings) {
    name = "Violin";
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public String sound() {
    return "Screech";
  }

}
