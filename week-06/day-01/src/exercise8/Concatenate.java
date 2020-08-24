package exercise8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Concatenate {
  public static void main(String[] args) {
    String firstName = "Aurél";
    List<Character> firstNameList = new ArrayList<>();
    List<Character> lastName = Arrays.asList('T', 'ö', 'l', 'g', 'y', 'e', 's', 'i');
    String lastNameString = getString(lastName);
    for (Character character : firstName.toCharArray()) {
      firstNameList.add(character);
    }
    firstName = firstNameList.stream()
        .map(Objects::toString)
        .collect(Collectors.joining("",""," " + lastNameString));
    ;
    System.out.println(firstName);
  }
  public static String getString(List<Character> list) {
    StringBuilder builder = new StringBuilder(list.size());
    for(Character ch: list)
    {
      builder.append(ch);
    }
    return builder.toString();
  }
}
