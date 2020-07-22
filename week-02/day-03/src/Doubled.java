import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {
    doubled("double.txt");
  }

  public static void doubled(String fileName) {
    try {
      Path filePath = Paths.get(fileName);
      List<String> list = Files.readAllLines(filePath);
      List<String> templist = new ArrayList<>();
      for (String i : list) {
        String line = "";
        for (int j = 0; j < i.length()-1; j++) {
          if (i.charAt(j) == i.charAt(j+1)) {
            line = line + i.charAt(j);

          }
        }
        templist.add(line);
      }
      Files.write(filePath, templist);
      System.out.println("nincs baj");
    } catch (Exception e) {
      System.out.println("baj van");
    }
  }
}
