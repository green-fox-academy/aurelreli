package sharpie;

public class Main {
  public static void main(String[] args) {
    Sharpie marker = new Sharpie("black", 0.5);
    System.out.println(marker.getInkAmount());
    marker.use();
    System.out.println(marker.getInkAmount());

  }
}
