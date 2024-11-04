import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TriangleTester {

  public static boolean helper(String input) {
    Scanner sc = new Scanner(input);
    int[] ary = new int[3];
    for (int i = 0; i < 3; i++) {
      ary[i] = sc.nextInt();
    }
    return (ary[0] + ary[1] > ary[2] &&
            ary[0] + ary[2] > ary[1] &&
            ary[1] + ary[2] > ary[0]);
  }


  public static int countTrianglesA(String filename) {
    int counter = 0;
    try {
      File file = new File(filename);
      Scanner sc = new Scanner(file);
      while(sc.hasNextLine()) {
        if (helper(sc.nextLine())) {
          counter += 1;
        }
      }
      sc.close();

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }
    return counter;
  }

  public static int helper2 (int[][]ary) {
    int counter = 0;
    for (int i = 0; i < 3; i++) {
      if (ary[0][i] + ary[1][i] > ary[2][i] &&
          ary[0][i] + ary[2][i] > ary[1][i] &&
          ary[1][i] + ary[2][i] > ary[0][i]) {
            counter++;
          }
    }
    return counter;
  }

  public static int countTrianglesB(String filename) {
    int counter = 0;
    try {
      File file = new File(filename);
      Scanner sc = new Scanner(file);
      while (sc.hasNextLine()) {
        int[][] ary = new int[3][3];
        for (int i = 0; i < 3; i++) {
          Scanner newLine = new Scanner(sc.nextLine());
          for (int j = 0; j < 3; j++) {
            ary[i][j] = newLine.nextInt();
          }
        }
        counter += helper2(ary);
      }
      sc.close();

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      System.exit(1);
    }
    return counter;
  }
}
