package sharpieset;

public class Main {
  public static void main(String[] args) {
    Sharpie marker = new Sharpie("black", 0.5);
    Sharpie pen = new Sharpie("blue", 0.2);
    Sharpie pencil = new Sharpie("black", 0.1);
    Sharpie gelPen = new Sharpie("blue", 0.2);
    System.out.println(marker.getInkAmount());
    marker.use();
    System.out.println(marker.getInkAmount());
    SharpieSet pencilcase = new SharpieSet();
    pencilcase.add(marker);
    pencilcase.add(pen);
    pencilcase.add(pencil);
    pencilcase.add(gelPen);
    pencilcase.countUsable();
    pencilcase.removeTrash();
  }
}
