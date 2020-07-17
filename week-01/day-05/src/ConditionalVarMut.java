public class ConditionalVarMut {
  public static void main(String[] args) {
    double a = 24;
    int out = 0;
    if ((a % 2) == 0) {
      out++;
    }
    System.out.println(out);

    int b = 13;
    String out2 = "";
    if ((b >= 10) && (b <= 20)) {
      out2 = "sweet!";
    } else if (b < 10) {
      out2 = "less!";
    } else {
      out2 = "more!";
    }
    System.out.println(out2);

    int c = 123;
    int credits = 100;
    boolean isbonus = false;
    if ((credits >= 50) && (isbonus == false)) {
      c=c+2;
    }
    System.out.println(c);

    int d = 8;
    int time = 120;
    String out3 = "";
    if (((d % 4) == 0) && (time <= 200)) {
      out3 = "check";
    } else if (time > 200) {
      out3 = "timeout";
    } else {
      out3 = "run forrest run";
    }
    System.out.println(out3);
  }
}
