import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Day2 {

  public static ArrayList<ArrayList<String>> readFile(String filename) {
    ArrayList<ArrayList<String>> result = new  ArrayList<ArrayList<String>>();
    try {
      File file = new File(filename);
      Scanner sc = new Scanner(file);
      while(sc.hasNextLine()) {
        String line = sc.nextLine();
        result.add(new ArrayList<String>(Arrays.asList(line.split(""))));
        }
        sc.close();
      } catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }
    return result;
  }

  public static int[] helper(ArrayList<String> ary, int[] nums) {
    int row = nums[0]; 
    int column = nums[1];
    for (int i = 0; i < ary.size(); i++) {
        if (ary.get(i).equals("L")) {
            column -= 1;
            if (column < 0) {
                column ++;
            }
        }
        else if (ary.get(i).equals("R")) {
            column += 1;
            if (column > 2) {
                column --;
            }
        }
        else if (ary.get(i).equals("D")) {
           row += 1;
           if (row > 2) {
            row -= 1;
           }
        }
        else if (ary.get(i).equals("U")) {
           row-=1;
           if (row < 0) {
            row ++;
           }
        }
    }
    return new int[]{row,column}; 
  }

  public static int bathroom(String filename) {
    int[][] keypad = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    String result = "";
    ArrayList<ArrayList<String>> lst = readFile(filename);
    int[] nums = new int[]{1,1};
    for (int i = 0; i < lst.size(); i++){
        int[] ary = helper(lst.get(i), nums);
        nums = ary;
        result += keypad[ary[0]][ary[1]];
    }
    return Integer.valueOf(result);
  }
}