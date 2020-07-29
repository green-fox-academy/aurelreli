public class SumDigits {
  public static void main(String[] args) {
    System.out.println(sumDigits(1234));
   // System.out.println(123%10);
  }
  public static int sumDigits(int n) {
    if (n % 10 == 0) {
      return 0;
    } else {
      return sumDigits(n/10) + (n % 10);
    }
  }
}
