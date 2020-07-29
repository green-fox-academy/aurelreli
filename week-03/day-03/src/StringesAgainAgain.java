public class StringesAgainAgain {
  public static void main(String[] args) {
    String text = "xoxox";
    System.out.println(stringes(text));
  }
  public static String stringes(String s) {
    if (s.length() == 1) {
      return s;
    } else {
      return s.charAt(0) + "*" + stringes(s.substring(1));
    }
  }
}