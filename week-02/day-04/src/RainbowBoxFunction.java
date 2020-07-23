import java.util.ArrayList;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 3 parameters:
    // The square size, the fill color, graphics
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
    Color INDIGO = new Color(29,0,51) ;
    Color VIOLET = new Color(93,51,93) ;

    ArrayList<Color> list = new ArrayList<>();
    list.add(Color.RED);
    list.add(Color.ORANGE);
    list.add(Color.YELLOW);
    list.add(Color.GREEN);
    list.add(Color.BLUE);
    list.add(INDIGO);
    list.add(VIOLET);
    int baseSize = 200;
    int space = 50;
    int spaceInc = 30;
    for (Color i : list) {
      centerRainbowSquares(baseSize + space, i, graphics);
      space = space - spaceInc;
    }
  }
  public static void centerRainbowSquares(int a,Color color, Graphics g) {
    g.setColor(color);
    g.fillRect((WIDTH/2)-(a/2),(HEIGHT/2)-(a/2), a, a);
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}