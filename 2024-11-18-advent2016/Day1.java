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
    ArrayList<int[]> ary = new ArrayList<int[]>();
    int x = 0; 
    int y = 0;
    int direction = 0;
    int[] initial = new int[]{0,0};
    ArrayList<String> lst = readFile(filename);
    int[][] coordinates = new int[][]{{0,1}, {1,0}, {0,-1}, {-1,0}};
    for (int i = 0; i < lst.size(); i++) {
      if (lst.get(i).contains("R")) {
        direction++;
      } else {
        direction--;
      }
      direction = (direction + 4) % 4; 
      x += coordinates[direction][0] * Integer.valueOf(lst.get(i).substring(1));
      y += coordinates[direction][1] * Integer.valueOf(lst.get(i).substring(1));
      ArrayList<int[]> temp = helper(x,y,initial);
        if (ary.size() > 0) {
          for (int j = 0; j < ary.size(); j++) {
            for (int k = 0; k < temp.size(); k++) {
              if (temp.get(k)[0] == ary.get(j)[0] && temp.get(k)[1] == ary.get(j)[1]) {
                return Math.abs(ary.get(j)[0]) + Math.abs(ary.get(j)[1]);
              }
            }
          }
        }
      ary.addAll(temp);
      initial = new int[]{x,y};
    }
    return Math.abs(x) + Math.abs(y);
  }

  public static ArrayList<int[]> helper(int x, int y, int[] initial) {
    ArrayList<int[]> ary = new ArrayList<int[]>(); 
    int xCount, yCount;
    if (initial[0] < x) xCount = 1;
    else xCount = -1; 

    if (initial[1] < y) yCount = 1;
    else yCount = -1;
    
    if (initial[0] == x) {
    for (int i = initial[1]; i != y; i += yCount) {
      ary.add(new int[]{x,i});
      }
    }

    else if (initial[1] == y) {
      for (int i = initial[0]; i != x; i+=xCount) {
        ary.add(new int[]{i,y});
        }
      }
    return ary;
  }
}