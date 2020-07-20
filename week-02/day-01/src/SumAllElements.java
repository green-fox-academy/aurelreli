public class SumAllElements {
  public static void main(String[] args) {
    // - Create an array variable named `numbers`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Print the sum of the elements in `numbers`
    int tomb[] = {3, 4, 5, 6, 7};
    int sum = 0;
    for (int i = 0; i < tomb.length; i++) {
      sum = tomb[i] + sum;
    }
    System.out.println(sum);
  }
}
