public class SwapElements {
  public static void main(String[] args) {
    // - Create an array variable named `orders`
    //   with the following content: `["first", "second", "third"]`
    // - Swap the first and the third element of `orders`
    String tomb[] = {"first", "second", "third"};
    String seged = tomb[0];
    tomb[0] = tomb[2];
    tomb[2] = seged;
    for (String t : tomb) {
      System.out.println(t);
    }
  }
}
