public class BunniesAgain {
  public static void main(String[] args) {
    System.out.println(ears(2));
  }

  public static int ears(int n) {
    if (n == 0) {
      return 0;
    } else {
      if (n % 2 == 1) {
        return ears(n-1) + 2;
      } else {
        return ears(n-1) + 3;
      }
    }
  }
}
