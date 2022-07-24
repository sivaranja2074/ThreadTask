package Thread;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
public class WriteFileUsingnioUtils {
   public static void main(String[] args) {
      Path path = Paths.get("C:\\java\\Task\\src\\Thread\\Test.txt");
      String str = "Welcome! This is Sivaranja";

      try {
         Files.write(path, str.getBytes());
         List<String> lines = Files.readAllLines(path);
         for (String line : lines) {
            System.out.println(line);
         }
      } 
      catch (IOException e) {
         System.out.println(e);
      }
   }
}
