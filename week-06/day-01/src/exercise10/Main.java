package exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Fox vuk = new Fox("red", "Vuk", 3 );
    Fox karak = new Fox("red", "Karak", 13 );
    Fox roka = new Fox("red", "Roka", 5 );
    Fox koma = new Fox("red", "Koma", 7 );
    Fox mrFox = new Fox("green", "Mr. Fox", 7 );
    List<Fox> foxList = new ArrayList<>();
    foxList.add(vuk);
    foxList.add(karak);
    foxList.add(roka);
    foxList.add(koma);
    foxList.add(mrFox);

    Map<Object, List<Fox>> colorList = foxList.stream()
      .collect(Collectors.groupingBy(c -> c.color.equals("green")))
    ;
  }

}
