package zoo;

public class Bird extends Animal{
  public Bird(String name, int age, String sex) {
    super(name, age, sex);
  }
  @Override
  public void breed() {
    System.out.println("laying eggs");
  }
}
