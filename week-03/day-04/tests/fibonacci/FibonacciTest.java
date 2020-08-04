package fibonacci;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class FibonacciTest {
  @Test
  public void isFibonacciRight() {
    assertEquals(0, Fibonacci.fibonacci(1));
  }
  @Test
  public void isFibonacciRight2() {
    assertEquals(21, Fibonacci.fibonacci(9));
  }
}
