import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Day1 {
  private int x;
  private int y

  public static int readFile(String filename) {
    ArrayList<String> result = new ArrayList<String>();
    try {
      File file = new File(filename);
      Scanner sc = new Scanner(file);
      while(sc.hasNextLine()) {
        String line = in.nextLine();
        String[]nums = line.split(", ")
        }
      }
      sc.close();

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }
    return counter;
  }
}
