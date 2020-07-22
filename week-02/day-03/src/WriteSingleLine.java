import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteSingleLine {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Név: ");
    String name = sc.nextLine();
    System.out.print("Fájl neve: ");
    String fileNameVar = sc.nextLine();
    writer(fileNameVar, name);
  }
  public static void writer(String fileName, String myName) {
    try {
      Path filePath = Paths.get(fileName);
      List<String> content = new ArrayList<>();
      content.add(myName);
      Files.write(filePath, content);
    } catch (Exception e) {
      System.out.println("unable to write the file");
    }
  }
}
