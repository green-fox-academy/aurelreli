import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    copy("my-file.txt", "my-file2");
  }
  public static void copy(String file1, String file2) {
    try {
      Path filePath1 = Paths.get(file1);
      Path filePath2 = Paths.get(file2);

      List<String> list = Files.readAllLines(filePath1);

      Files.write(filePath2, list);

      System.out.println("nézd meg jó-e");
    } catch (IOException e) {
      System.out.println("baj van");
    }
  }
}
