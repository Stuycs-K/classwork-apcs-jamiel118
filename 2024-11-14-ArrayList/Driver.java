import java.util.ArrayList;
public class Driver{
  public static void main(String[] args){
    ArrayList<String> a = ArrayListPractice.createRandomArray(200000);
    for (int i = 0; i < 200000; i++) {
      System.out.println(a.get(i));
    }

    ArrayListPractice.replaceEmpty(a);
    for (int i = 0; i < 200000; i++) {
      System.out.println(a.get(i));
    }

  }
}