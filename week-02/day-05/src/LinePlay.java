import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

  public static void mainDraw(Graphics graphics) {
    int startingPoint = 50;
    int freq = 20;
    Color PURPLE = new Color(255,0,255);
    graphics.setColor(PURPLE);
    for (int j = startingPoint; j < WIDTH; ) {
      graphics.drawLine(j, 0, WIDTH, j - startingPoint);
      j = j + freq;
    }
    graphics.setColor(Color.GREEN);
    for (int i = startingPoint; i < HEIGHT; ) {
      graphics.drawLine(0, i, i - startingPoint, HEIGHT);
      i = i + freq;
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