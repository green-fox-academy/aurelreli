package sumos;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.ArrayList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumTest {
  Sum sum;

  @BeforeEach
  void initializeList() {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(3);
    list.add(3);
    list.add(3);
    list.add(3);
    list.add(3);
  }
  @Test
  void areSumsRight(ArrayList<Integer> list) {
    list.add(3);
    list.add(3);
    list.add(3);
    list.add(3);
    list.add(3);
    list.add(3);
    int realsum = 0;
    for (int i = 0; i < list.size(); i++) {
      realsum = realsum + list.get(i);
    }
    assertEquals(realsum,sum.sum(list));
  }
}
