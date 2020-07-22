import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
  public static void main(String[] args) {
    writer("my-file.txt", "pear", 7);
  }
  public static void writer(String path, String word, int number) {
    try {
      Path filePath = Paths.get(path);
      List<String> content = new ArrayList<>();
      for (int i = 0; i < number; i++) {
        content.add(word);
      }
      Files.write(filePath, content);
    } catch (Exception e) {
      System.out.println("Something is wrong");
    }

  }
}
