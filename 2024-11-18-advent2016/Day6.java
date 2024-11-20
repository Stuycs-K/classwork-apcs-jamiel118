import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Day6 {
  public static  ArrayList<String> readFile(String filename) {
    ArrayList<String> result = new ArrayList<String>();
    try {
      File file = new File(filename);
      Scanner sc = new Scanner(file);
      while(sc.hasNextLine()) {
        result.add(sc.nextLine());
        }
        sc.close();
      } catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }
    return result;
  }

  public static int helper(String str) {
    int count = 0;
    return count;
  }

  public static String solve(String filename) {
    ArrayList<String> lst = readFile(filename);
    String result = "";
    int temp = 0;
    for (int i = 0; i < lst.size(); i++) {
      
    }
    return result;
  }
}
