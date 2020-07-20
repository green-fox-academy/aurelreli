public class CompareLength {
  public static void main(String[] args) {
    // - Create an array variable named `firstArrayOfNumbers`
    //   with the following content: `[1, 2, 3]`
    // - Create an array variable named `secondArrayOfNumbers`
    //   with the following content: `[4, 5]`
    // - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
    //   elements than `firstArrayOfNumbers`
    int[] firstArray = {1, 2, 3};
    int[] secondArray = {4, 5};
    if (secondArray.length > firstArray.length) {
      System.out.println("second is longer");
    } else {
      System.out.println("first is longer");
    }
  }
}
