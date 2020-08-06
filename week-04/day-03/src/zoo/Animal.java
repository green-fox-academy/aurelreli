package zoo;

public abstract class Animal {
  private String name;
  private int age;
  private String sex;

  public Animal(String name, int age, String sex) {
    this.name = name;
    this.age = age;
    this.sex = sex;
  }
  public Animal() {
    name = "animal";
    age = 0;
    sex = "default";
  }

  public String getSex() {
    return sex;
  }

  public String getName() {
    return name;
  }

  public void drink() {
    System.out.println("drinking...");
  }
  public void eat() {
    System.out.println("eating...");
  }
  public void breed() {

  }
}
