public class PrintAll {
  public static void main(String[] args) {
    // - Create an array variable named `numbers`
    //   with the following content: `[4, 5, 6, 7]`
    // - Print all the elements of `numbers`
    int[] numbers = {4, 5, 6, 7};
    //klasszikus megoldás
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
    //optimalizált megoldás
    for (int num : numbers) {
      System.out.println(num);
    }
  }
}
