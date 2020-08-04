package anagram;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.nio.charset.Charset;
import java.util.Random;
import org.junit.jupiter.api.Test;

public class AnagramTest {
  @Test
  void isAnagramForReal() {
    assertEquals(true, Anagram.isAnagram("majom", "joamm"));

  }
}
