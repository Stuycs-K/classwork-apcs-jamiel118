public class MyArrays {
  public static int[] returnCopy(int[]ary) {
    int[] result = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      result[i] = ary[i];
    }
    return result;
  }

  public static String aryToString(int[] nums) {
    String result = "[";
    for (int i =0; i < nums.length; i++) {
      result += nums[i];
      if (i < nums.length - 1) {
        result += ", ";
      }
    }
    return result;
  }

  public static void main(String[] args) {

  }
}
