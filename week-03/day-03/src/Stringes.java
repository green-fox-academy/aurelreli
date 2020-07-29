public class Stringes {
  public static void main(String[] args) {
    String text = "xoxox";
    System.out.println(stringes(text));
  }
  public static String stringes(String s) {
    if (s.length() == 0) {
      return s;
    } else {
      if (s.charAt(0) == 'x') {
        return 'y' + stringes(s.substring(1));
      } else {
        return s.charAt(0) + stringes(s.substring(1));
      }
    }
  }
}
