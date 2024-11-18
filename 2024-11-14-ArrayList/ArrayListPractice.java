import java.util.ArrayList;

public class ArrayListPractice{
  public static ArrayList<String>createRandomArray(int size){
    ArrayList<String>ary = new ArrayList<String>(size);
    for (int i = 0; i < size; i++){
      ary.add(""+(int)(Math.random() * 11));
      if (ary.get(i).equals("0")){
        ary.set(i, "");
      }

    }
    return ary;
  }

  public static void replaceEmpty( ArrayList<String> original){
    for (int i = 0; i < original.size(); i++){
      if (original.get(i).equals("")){
        original.set(i, "Empty");
      }

    }

  }

  public static ArrayList<String> makeReversedList( ArrayList<String> original){
    //return a new ArrayList that is in the reversed order of the original.
    ArrayList<String> result = new ArrayList<String>(original.size());
    for (int i = original.size() - 1; i > -1; i--) {
        result.add(original.get(i));
    }
    return result;
  } 
  

}