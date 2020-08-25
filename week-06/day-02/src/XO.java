public class XO {

  public static void main(String[] args) {

  }
  public static boolean getXO (String str) {
    int x = 0;
    int o = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'x') {
        x++;
      } else if (str.charAt(i) == 'o') {
        o++;
      }
    }
    return (x == o);
  }
}