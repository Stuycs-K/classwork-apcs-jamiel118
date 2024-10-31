import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TriangleTester.java {

  Scanner sc = new Scanner("inputTri.txt");

  public static boolean helper(String input) {
    int[] ary = new int[3];
    int count = 3;
    for (int i = 0; i < count; i++) {
      ary[i] = input.nextInt();
    }
    return (ary[0] + ary[1] <= ary[2] || ary[0] + ary[2] <= ary[1] || ary[1] + ary[2] <= ary[0] )
  }

  public static int countTrianglesA(String filename) {
    int counter = 0;
    while(input.hasNextLine()) {
      if (helper(inputTri.txt.nexLine())) {
        counter += 0;
      }
    }
    return counter;
  }
}
