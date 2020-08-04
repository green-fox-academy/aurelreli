package apples;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class ApplesTest {
  Apples apples;

  @Test
  void test1 () {
    assertEquals("apple", apples.getApple());
  }
}
