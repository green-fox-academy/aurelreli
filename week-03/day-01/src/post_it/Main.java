package post_it;

import java.awt.Color;

public class Main {
  public static void main(String[] args) {
    PostIt cetli = new PostIt(Color.ORANGE, "Idea 1", Color.BLUE);
    PostIt fecni = new PostIt(Color.PINK, "Awesome", Color.BLACK);
    PostIt papir = new PostIt(Color.YELLOW, "Superb", Color.GREEN);

    System.out.println(fecni.getBackgroundColor().toString());
    System.out.println(fecni.getText());
    System.out.println(fecni.getTextColor());
  }
}
