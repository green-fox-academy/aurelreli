public class Power {
  public static void main(String[] args) {
    System.out.println(power(2,0));
  }
  public static int power(int n, int h) {
    if ( h == 0) {
      return 1;
    } else {
      return power(n,h-1) * n;
    }
  }
}
