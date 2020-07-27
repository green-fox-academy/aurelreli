import java.util.ArrayList;

public class PersonalFinance {
  public static void main(String[] args) {
    ArrayList<Integer> expenses = new ArrayList<Integer>();
    expenses.add(500);
    expenses.add(1000);
    expenses.add(1250);
    expenses.add(175);
    expenses.add(800);
    expenses.add(120);
    double sum = 0;
    for (int i : expenses) {
      sum = sum + i;
    }
    System.out.println(sum);
    int max = -1;
    for (int i : expenses) {
      if (i > max) {
        max = i;
      }
    }
    System.out.println(max);
    int min = max;
    for (int i : expenses) {
      if (i < min) {
        min = i;
      }
    }
    System.out.println(min);
    double avg = (sum / expenses.size());
    System.out.println(avg);
  }
}
