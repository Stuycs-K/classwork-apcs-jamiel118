import java.util.Scanner;

public class ColorDemo{
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";
  public static final String Reset = "\u001b[0m";
  public static int Green = 32;
  public static int Cyan = 36;
  public static int White = 37;

  public static void color(int foreground, int modifier){
    System.out.print( "\u001b[" + foreground + ";" + modifier + "m");
  }

  public static void cow() {
    System.out.println(HIDE_CURSOR + CLEAR_SCREEN);
    Scanner input = new Scanner(System.in);
    System.out.println("Enter text color:");
    int textColor = input.nextInt();

    color(textColor,1);

    input = new Scanner(System.in);
    System.out.println("Enter text:");
    String text = input.nextLine();

    System.out.println("_________________________________________");
    System.out.println("<" + text + ">");
    System.out.println("_________________________________________");
    System.out.println("        \\   ^__^\n         \\  (oo)\\_______\n            (__)\\       )\\/\\\n                ||----- |\n                ||     ||");
    System.out.println(SHOW_CURSOR);
    System.out.print(Reset);
  }

  public static void main(String[] args) {
    cow();
  }
}
