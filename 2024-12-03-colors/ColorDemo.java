public class ColorDemo{
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";
  public static final String Reset = "\u001b[";
  public static int Green = 32;
  public static int Cyan = 36;
  public static int White = 37;

  public static void color(int foreground, int background, int modifier){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + ";" + modifier + "m");
  }


  public static void main(String[] args) {
    color(36,37,1);
    System.out.println("Hello World" + Reset);

  }
}
