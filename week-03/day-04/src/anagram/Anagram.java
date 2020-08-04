package anagram;

import java.nio.charset.Charset;
import java.util.Random;

public class Anagram {
  public static void main(String[] args) {
    System.out.println(isAnagram("majom", "aojmm"));
  }

  public static boolean isAnagram(String word1, String word2) {
    String tempWord = "";
    if (word1.length() == word2.length()) {
      for (int i = 0; i < word1.length(); i++) {
        for (int j = 0; j < word2.length(); j++) {
          if (word1.charAt(i) == word2.charAt(j)) {
            tempWord = tempWord + word1.charAt(i);
            break;
          }
        }
      }
    }
    return tempWord.length() == word1.length();
  }
}
