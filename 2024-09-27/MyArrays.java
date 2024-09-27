public class MyArrays {
  public static int[] returnCopy(int[]ary) {
    int[] result = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      result[i] = ary[i];
    }
  }
  return result;
}
