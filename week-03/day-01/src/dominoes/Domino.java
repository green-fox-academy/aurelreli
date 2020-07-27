package dominoes;

import java.util.Arrays;

public class Domino {
  private final int left;
  private final int right;
  private boolean motva;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
    this.motva = false;
  }

  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
  }

  public boolean getmotva() {
    return motva;
  }

  public void setMotva() {
    motva = true;
  }
  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }
}
