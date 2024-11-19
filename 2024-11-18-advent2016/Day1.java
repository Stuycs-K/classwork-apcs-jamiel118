import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Day1 {

  public static  ArrayList<String> readFile(String filename) {
    ArrayList<String> result = new ArrayList<String>();
    try {
      File file = new File(filename);
      Scanner sc = new Scanner(file);
      while(sc.hasNextLine()) {
        String line = sc.nextLine();
        ArrayList<String>nums = new ArrayList<String>(Arrays.asList(line.split(", ")));
        result.addAll(nums);
        }
        sc.close();
      } catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }
    return result;
  }

  public static int EasterBunny(String filename) {
    int x = 0;
    int y = 0;
    String direction = "north";
    ArrayList<String> lst = readFile(filename);
    for (int i = 0; i < lst.size(); i++) {
      if (direction.equals("north")) {
        if (lst.get(i).contains("R")) {
          direction = "east";
          x += Integer.valueOf(lst.get(i).substring(1));
        } else {
          direction = "west";
          x -= Integer.valueOf(lst.get(i).substring(1));
        }
      }
      else if (direction.equals("south")) {
        if (lst.get(i).contains("L")) {
          direction = "east";
          x += Integer.valueOf(lst.get(i).substring(1));
        } else {
          direction = "west";
          x -= Integer.valueOf(lst.get(i).substring(1));
        }
      }
      else if (direction.equals("east")) {
        if (lst.get(i).contains("R")) {
          direction = "south";
          y -= Integer.valueOf(lst.get(i).substring(1));
        } else {
          direction = "north";
          y += Integer.valueOf(lst.get(i).substring(1));
        }
      }
      else if (direction.equals("west")) {
        if (lst.get(i).contains("L")) {
          direction = "south";
          y -= Integer.valueOf(lst.get(i).substring(1));
        } else {
          direction = "north";
          y += Integer.valueOf(lst.get(i).substring(1));
        }
      }
    }
    return Math.abs(x) + Math.abs(y);
  }
}
