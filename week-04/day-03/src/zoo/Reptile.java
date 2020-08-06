package zoo;

public class Reptile extends Animal{

  public Reptile(String name, int age, String sex) {
    super(name, age, sex);
  }

  @Override
  public void breed() {
    System.out.println("laying eggs");
  }
}
