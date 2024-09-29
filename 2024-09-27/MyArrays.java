public class MyArrays {
  public static int[] returnCopy(int[]ary) {
    int[] result = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      result[i] = ary[i];
    }
    return result;
  }

  public static int[] concatArray(int[]ary1, int[]ary2) {
    int[] result = new int[ary1.length + ary2.length];
    for (int i = 0; i < ary1.length; i++) {
      result[i] = ary1[i];
    }
    for (int i = 0; i < ary2.length; i++) {
      result[i + ary1.length] = ary2[i];
    }
    return result;
  }

  public static String aryToString(int[] nums) {
    String result = "{";
    for (int i =0; i < nums.length; i++) {
      result += nums[i];
      if (i < nums.length - 1) {
        result += ", ";
      }
    }
    return result + "}";
  }

  public static void main(String[] args) {
    int[] firstAry = {1, 2, 3, 4, 5};
    int[] copyAry = returnCopy(firstAry);
    System.out.println("returnCopy: arrays are the same? " + (firstAry == copyAry));

    String combinedAry = "{1, 2, 3, 4, 5}";
    int[] ary1 = {1, 2, 3};
    int[] ary2 = {4, 5};
    String result = aryToString(concatArray(ary1, ary2));
    System.out.println("concatArray: Are the arrays combined? " + (combinedAry.equals(result)));
  }
}
