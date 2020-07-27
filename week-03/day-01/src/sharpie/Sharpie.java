package sharpie;

public class Sharpie {
  private String color;
  private double width;
  private double inkAmount;

  float defaultInk = 100;

  public Sharpie(String color, double width) {
    this.color = color;
    this.width = width;
    this.inkAmount = defaultInk;
  }
  public void use() {
    inkAmount--;
  }

  public String getColor() {
    return color;
  }

  public double getWidth() {
    return width;
  }

  public double getInkAmount() {
    return inkAmount;
  }
}
