package countletters;

import java.util.HashMap;

public class CountLetters {
  public static void main(String[] args) {
    System.out.println(letterCounter("ez mennyi"));
  }
  public static HashMap letterCounter(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      if (map.containsKey(s.charAt(i))) {
        map.replace(s.charAt(i), map.get(s.charAt(i)), map.get(s.charAt(i)) + 1);
      } else {
        map.put(s.charAt(i), 1);
      }
    }
    return map;
  }
}
