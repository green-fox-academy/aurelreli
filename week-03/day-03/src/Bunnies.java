public class Bunnies {
  public static void main(String[] args) {
    System.out.println(ears(5));
  }
  public static int ears(int n) {
    if ( n == 0) {
      return 0;
    } else {
      return ears(n-1) + 2;
    }
  }
}
