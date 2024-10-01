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
    initial += arrToString(ary[i]);
    if (i < ary.length - 1) {
        initial += ", ";
    }
  }
  return initial;
}

/*Return the sum of all of the values in the 2D array */
public static int arr2DSum(int[][]nums){
    int sum = 0;
    for (int i = 0; i < ary.length; i++){
        for (int j = 0; j < ary[i].length; j++) {
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
  public static void main(String[] args){
  }
} 