package counter;

public class Main {
  public static void main(String[] args) {
    Counter c = new Counter();
    c.add();
    c.add(30);
    System.out.println(c.get());
    c.reset();
    System.out.println(c.get());
  }
}
