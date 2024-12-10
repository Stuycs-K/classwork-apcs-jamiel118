import java.util.Scanner;

public class Game {

  public static void main(String[] args) {

    CodeWarrior enemy = new CodeWarrior();
    Thief player = new Thief("Nobody");
    Scanner userInput = new Scanner(System.in);

    while(true) {

      if (player.getHP() > 0) {
        System.out.println(enemy.getName() + ", " + enemy.getHP() + " HP, " + enemy.getSpecial() + " " + enemy.getSpecialName());
        System.out.println(player.getName() + ", " + player.getHP() + " HP, " + player.getSpecial() + " " + player.getSpecialName());

        System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
        String input = userInput.nextLine();

        if(input.equals("quit")) {
          break;
        }
        else if (input.equals("sp")) {
          player.specialAttack(enemy);
          System.out.println("You performed a special attack on the enemy");
        }
        else if (input.equals("su")) {
          player.support();
          System.out.println("You healed yourself");
        }
        else if (input.equals("a")) {
          player.attack(enemy);
          System.out.println("You attack the enemy");
        }
        else {
          System.out.println("Not a valid input, type (a)ttack / (sp)ecial / (su)pport / quit");
        }
      } else {
        System.out.println("You lost! The enemy won");
        break;
      }
    }
  }
}
