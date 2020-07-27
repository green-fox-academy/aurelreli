
package counter;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.03.29..
 */
class CounterTest {

  Counter c = new Counter();

  void addMore() {
    c.add(5);
    assertEquals(5, c.get());
  }

  @Test
  void addOne() {
    c.add();
    assertEquals(1, c.get());
  }

  @Test
  void getZero() {
    assertEquals(0, c.get());
  }

  @Test
  void getInit() {
    Counter c = new Counter();
    c.add(7);
    assertEquals(7, c.get());
  }

  @Test
  void resetToZero() {
    c.add();
    c.reset();
    assertEquals(0, c.get());
  }

  @Test
  void resetToInit() {
    Counter c = new Counter(7);
    c.add(5);
    c.reset();
    assertEquals(7, c.get());
  }

}

public class Counter {
  private int value;
  private int realInit;
  int defaultValue;

  public Counter() {
    this.value = defaultValue;
  }
  public Counter(int initValue) {
    this.value = initValue;
    this.realInit = initValue;
  }


  public void add(int anotherValue) {
    value = value + anotherValue;
  }

  public void add() {
    value++;
  }

  public int get() {
    return value;
  }

  public int getInitValue() {
    return realInit;
  }

  public void reset() {
    this.value = getInitValue();
  }
}
