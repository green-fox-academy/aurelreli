import java.lang.reflect.Array;

public class MaxFinder {
  public static void main(String[] args) {
    int[] array = {1,2,34,5,123,7,7,86,88};
    int n = array.length;
    System.out.println(maxFinder(array, n));
  }
  public static int maxFinder(int[] array, int n) {
    if (n == 0) {
      if (n > n-1) {
        return n;
      } else {
        return n-1;
      }
    } else {
      return maxFinder(array, n-1);
    }
  }
}
