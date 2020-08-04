package sumos;

import java.util.ArrayList;

public class Sum {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(3);
    list.add(3);
    list.add(3);
    list.add(3);
    list.add(3);
    System.out.println(sum(list));
  }
  public static int sum(ArrayList<Integer> arrayList) {
    int summa = 0;
    for (int i = 0; i < arrayList.size(); i++) {
      summa = summa + arrayList.get(i);
    }
    return summa;
  }
}
