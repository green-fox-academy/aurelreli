import java.util.HashMap;

public class TeleBook {
  public static void main(String[] args) {
    HashMap<String, String> tele = new HashMap<String, String>();
    tele.put("William A. Lathan", "405-709-1865");
    tele.put("John K. Miller", "402-247-8568");
    tele.put("Hortensia E. Foster", "606-481-6467");
    tele.put("Amanda D. Newland", "319-243-5613");
    tele.put("Brooke P. Askew", "307-687-2982");
    System.out.println(tele.get("William A. Lathan"));
    for (String i : tele.keySet()) {
      if (tele.get(i) == "307-687-2982") {
        System.out.println(i);
      }
    }
    System.out.println(tele.containsKey("Chris E. Myers"));
  }
}
