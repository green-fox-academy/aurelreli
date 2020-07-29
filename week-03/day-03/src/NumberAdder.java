public class NumberAdder {
  public static void main(String[] args) {
    System.out.println(addNumber(3));
  }
  public static int addNumber(int n) {
    if (n == 0) {
      return 0;
    } else {
      return addNumber(n-1) + n;
    }
  }
}
