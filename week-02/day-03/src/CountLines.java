import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    counter("my-file.txt");
  }
  public static void counter(String fileName) {
    try {
      Path filePath = Paths.get(fileName);
      List<String> lista = Files.readAllLines(filePath);
      System.out.println(lista.size());
      } catch (Exception e) {
      System.out.println("0");
    }
    return;
  }
}
