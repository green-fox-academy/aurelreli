public class Reverse {
  public static void main(String[] args) {
    // - Create an array variable named `numbers`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Reverse the order of the elements in `numbers`
    // - Print the elements of the reversed `numbers`

    //egyik megoldás
    int numbers[] = {3, 4, 5, 6, 7};
    int tomb2[] = {3, 4, 5, 6, 7};
    //másik megoldás
    //int tomb2[] = {3, 4, 5, 6, 7};
    //int numbers[] = new int[tomb2.length];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = tomb2[numbers.length - 1 - i];
    }
    //kiíratás
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
  }
}
