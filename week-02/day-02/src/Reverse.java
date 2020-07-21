public class Reverse {
  public static void main(String[] args) {
    String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    // Create a method that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.
    String temp = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI" ;
    String temp2 = "";
    for (int i = 0; i < toBeReversed.length(); i++) {
      toBeReversed = toBeReversed.replace((toBeReversed.charAt(i)),  (temp.charAt(toBeReversed.length()-1-i)));
      System.out.print(temp.charAt(toBeReversed.length()-1-i));
    }
    //System.out.println(temp.charAt(toBeReversed.length()-1));
    System.out.println(toBeReversed);
    //System.out.println(reverse(toBeReversed));
  }
}
