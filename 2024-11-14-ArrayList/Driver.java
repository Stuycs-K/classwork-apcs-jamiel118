import java.util.ArrayList;
public class Driver{
  public static void main(String[] args){
    ArrayList<String> a = ArrayListPractice.createRandomArray(200000);
    System.out.println(a);
    ArrayList<String> b = ArrayListPractice.createRandomArray(10);
    System.out.println(b);

    ArrayListPractice.replaceEmpty(a);
    System.out.println(a);
    ArrayListPractice.replaceEmpty(b);
    System.out.println(b);

    ArrayList<String> c = ArrayListPractice.makeReversedList(b);
    System.out.println(c);
    
    ArrayList<String> d = ArrayListPractice.createRandomArray(5);
    System.out.println(d);
    ArrayList<String> e = ArrayListPractice.createRandomArray(2);
    System.out.println(e);
    ArrayList<String> test = ArrayListPractice.mixLists(d,e);
    System.out.println(test);
  }
}