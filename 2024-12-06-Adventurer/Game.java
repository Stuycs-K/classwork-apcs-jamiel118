public class Game {

  public static void main(String[] args) {

    CodeWarrior enemy = new CodeWarrior();
    Thief player = new Thief("Nobody");
    Scanner userInput = new Scanner(System.in);

    while(true) {
      System.out.println(enemy.getName() + ", " + enemy.getHP() + " HP, " + enemy.getSpecial() + " " + enemy.getSpecialName());
      System.out.println(player.getName() + ", " + player.getHP() + " HP, " + player.getSpecial() + " " + player.getSpecialName());

      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String input = userInput.nextLine();

      if(input.equals("a")) {
        player.attack(enemy);
      }
      if (input.equals("sp")) {
        player.specialAttack(enemy);
      }
      if (input.equals("su")) {
        player.support();
      }
      if (input.equals)
    }
}
