public class Recursion {
  public static void makeWords(int remainingLetters, String result, String alphabet){
    for (int i = 0; i < alphabet.length(); i++) {
      if (remainingLetters == 0){
        System.out.println(result);
      } else {
        makeWords(remainingLetters - 1, result + alphabet.charAt(i), alphabet);
      }
    }
  }
  public static void main(String[] args) {
    makeWords(2,"","abc");
  }
}
