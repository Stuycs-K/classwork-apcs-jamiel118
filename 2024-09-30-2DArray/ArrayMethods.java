//ethan and jamie

public class ArrayMethods {
    public static String arrToString(int[] nums){
    if (nums.length == 0){
      return "[]";
    }
    String initial = "";
    initial = initial + "[";  
    for (int i = 0; i < nums.length; i++){
      initial += nums[i];
      if (i < nums.length - 1){
        initial += ", ";
      }
    }
    initial += "]";
    return initial;
  }

    //3. Write arrToString, with a 2D array parameter.
//Note: Different parameters are allowed with the same function name.
/**Return a String that represets the 2D array in the format:
  * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
  * Note the comma+space between values, and between arrays
  * You are encouraged to notice that you may want to re-use
  * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
  */
public static String arrToString(int[][]ary){
  //this should use arrToString(int[])
  String initial = "[";
  for (int i = 0; i < ary.length; i++){
    if (ary[i] != null) {
        initial += arrToString(ary[i]);  
    }
    else {
        initial += "null";
    }
    if (i < ary.length - 1) {
        initial += ", ";
    }
  }
  return initial + "]";
}

/*Return the sum of all of the values in the 2D array */
public static int arr2DSum(int[][]nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++){
        for (int j = 0; j < nums[i].length; j++) {
            sum += nums[i][j];
        }
    }
    return sum;
}

 //use a nested loop to solve this
/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  * [2][3] -> [3][2]
  */
public static int[][] swapRC(int[][]nums){
    int[][] result = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums[0].length; i++) {
        for (int j = 0; j < nums.length; j++) {
            result[i][j] = nums[j][i];
        }
    }
    return result;
}

//3. Modify a given 2D array of integer as follows:
//Replace all the negative values:
//-When the row number is the same as the column number replace
//that negative with the value 1
//-All other negatives replace with 0
public static void replaceNegative(int[][] vals){ 
  for (int i = 0; i < vals.length; i++) {
    for (int j = 0; j < vals[i].length; j++) {
      if (vals[i][j] < 0) {
        if (i == j) {
          vals[i][j] = 1;
        }
        else {
          vals[i][j] = 0;
        }
      }
    }
  }
  System.out.print(arrToString(vals));
}

//4. Make a copy of the given 2d array.
//When testing : make sure that changing the original does NOT change the copy.
//DO NOT use any built in methods that "copy" an array.
//You SHOULD write a helper method for this.
//If you don't see a good way to do that, you should stop and look at prior methods.
public static int[] copyHelper(int[] nums) {
  int[] copy = new int[nums.length];
  for (int i = 0; i < nums.length; i++) {
    copy[i] = nums[i];
  }
  return copy;
}

public static int[][] copy(int[][] nums){
  int[][] copy = new int[nums.length][];
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] != null)
    copy[i] = copyHelper(nums[i]);
  }
  return copy;
}


  public static void main(String[] args){
    //arrToString 
    int[][] testerAry = new int[][]{{1, 2, 3}, {1}};
    System.out.println("expected: [[1, 2, 3], [1]]  " + "result: " + arrToString(testerAry));
    testerAry = new int[3][1];
    System.out.println("expected: [[0], [0], [0]]  " + "result: " + arrToString(testerAry));
    testerAry = new int[][]{{1, 2}, {1, 2}};
    System.out.println("expected: [[1, 2], [1, 2]]  " + "result: " + arrToString(testerAry));
    testerAry = new int[3][];
    System.out.println("expected: [null, null, null]  " + "result: " + arrToString(testerAry));
    
    //arr2DSum
    int[][] testerNums = new int[][]{{1,2}, {1,2}};
    System.out.println("expected: 6 " + "result: " + arr2DSum(testerNums));
    testerNums = new int[3][1];
    System.out.println("expected: 0 " + "result: " + arr2DSum(testerNums));

    //swapRC
    testerNums = new int[][]{{1,2,3}, {1,2,3}};
    int[][] result = swapRC(testerNums);
    System.out.println("expected: [[1, 1], [2, 2], [3, 3]] " + "result: " + arrToString(result));

    //replaceNegative
    int[][] vals = new int[][]{{-1,1}, {-1,2}};
    System.out.print("expected: [[1, 1], [0, 2]]  result: ");
    replaceNegative(vals);
    vals = new int[][]{{-1,1,3,4,4}, {-1,-2,4}, {0}};
    System.out.print("\nexpected: [[1, 1, 3, 4, 4], [0, 1, 4], [0]]  result: ");
    replaceNegative(vals);

    //copy
    int[][] copy = new int[3][4];
    System.out.println("\nexpected: [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]  result: " + arrToString(copy(copy)));
    System.out.println("are the array addresses the same?: " + (copy == copy(copy)));
    copy = new int[][]{{1,2}, {1,2,3,4}, {1,2,3}};
    System.out.println("expected: [[1, 2], [1, 2, 3, 4], [1, 2, 3]]  result: " + arrToString(copy(copy)));
    System.out.println("are the array addresses the same?: " + (copy == copy(copy)));
    copy = new int[3][];
    System.out.println("expected: [null, null, null]  result: " + arrToString(copy(copy)));
    System.out.println("are the array addresses the same?: " + (copy == copy(copy)));
    } 
}