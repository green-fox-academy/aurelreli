package countletters;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.HashMap;
import org.junit.jupiter.api.Test;

public class CountLettersTest {
  @Test
  public void doesItReallyCountLetters() {
    HashMap<Character, Integer> map = new HashMap<>();
    map.put('s', 2);
    map.put('o', 1);
    map.put('r', 1);
    map.put('u', 1);
    map.put('d', 1);
    map.put(' ', 1);
    assertEquals(map, CountLetters.letterCounter("sos rud"));
  }
}
