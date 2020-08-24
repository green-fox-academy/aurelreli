package printable;

public class Main {
  public static void main(String[] args) {
    Domino domino = new Domino(3, 6);
    Todo todo = new Todo("buy milk", 1, false);
    domino.printAllFields();
    todo.printAllFields();
  }
}
