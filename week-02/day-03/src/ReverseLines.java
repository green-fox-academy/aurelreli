import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReverseLines {
  public static void main(String[] args) {
    reverser("reverselines.txt");
  }
  public static void reverser(String fileName) {
    try {
      Path filePath = Paths.get(fileName);
      List<String> list = Files.readAllLines(filePath);
      List<String> templist = new ArrayList<>();
      for (String i : list) {
        String line = "";
        for (int j = i.length()-1; j >= 0; j--) {
          line = line + i.charAt(j);
        }
        templist.add(line);
      }
      Files.write(filePath, templist);
    } catch (Exception e) {
      System.out.println("baj van");
    }
  }
}
