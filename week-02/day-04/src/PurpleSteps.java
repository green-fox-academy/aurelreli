import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
  public static void mainDraw(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r3.png]
    int baseSize = 20;
    int space = 20;
    int times = 13;
    int padding = 2;
    for (int i = 0; i < times; i++) {
      int xy = (space * i) + space;
      graphics.setColor(Color.black);
      graphics.fillRect(xy, xy, baseSize+padding, baseSize+padding);
    }
    for (int i = 0; i < times; i++) {
      int xy = (space * i) + space;
      graphics.setColor(Color.PINK);
      graphics.fillRect(xy+padding, xy+padding, baseSize-padding, baseSize-padding);

    }

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