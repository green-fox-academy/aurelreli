import java.util.Arrays;

public class SubInt {
  //  Create a function that takes a number and an array of integers as a parameter
  //  Returns the indices of the integers in the array of which the first number is a part of
  //  Or returns an empty array if the number is not part of any of the integers in the array

  public static void main(String[] args) {
    int array[] = {1, 31, 44, 65, 72, 21};
    System.out.println(Arrays.toString(subint(1, array)));
  }

  public static int[] subint(int in, int array[]) {
    int[] indice = {};
    int j = 0;
    for (int i = 0; i < array.length; i++) {
      if ((Integer.toString(array[i]).indexOf(in)) != -1) {
        indice[j] = array[i];
      }
    }

    return indice;
  }
}
