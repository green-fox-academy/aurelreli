import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

  public static void mainDraw(Graphics graphics) {
    int startingPoint = 50;
    int freq = 10;
    int centerX = WIDTH / 2;
    int centerY = HEIGHT / 2;
    graphics.setColor(Color.GREEN);
//balalsó
    for (int i = startingPoint; i <= (centerX + freq); ) {
      graphics.drawLine(i - freq, centerY, centerX, i + centerY - startingPoint + freq);
      i = i + freq;
    }
//jobbfelső
   /* for (int i = startingPoint; i < centerY; ) {
      graphics.drawLine(centerX, i, i + centerX - startingPoint, centerY);
      i = i + freq;
    }
//balfelső
    for (int i = startingPoint; i < centerX; ) {
      graphics.drawLine(i , centerY, centerX,centerY - i + startingPoint );
      i = i + freq;
    }
//jobbalsó
    for (int i = startingPoint; i < centerY; ) {
      graphics.drawLine(centerX,centerY + i - startingPoint,WIDTH - i,centerY);
      i = i + freq;
    }*/
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