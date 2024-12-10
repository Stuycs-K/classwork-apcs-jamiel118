import java.util.Scanner;

public class Game {

  public static void main(String[] args) {

    CodeWarrior enemy = new CodeWarrior();
    Thief player = new Thief("Nobody");
    Scanner userInput = new Scanner(System.in);

    while(true) {
      System.out.println(enemy.getName() + ", " + enemy.getHP() + " HP, " + enemy.getSpecial() + " " + enemy.getSpecialName());
      System.out.println(player.getName() + ", " + player.getHP() + " HP, " + player.getSpecial() + " " + player.getSpecialName());

      if (player.getHP() > 0) {
        System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
        String input = userInput.nextLine();

        if(input.equals("quit")) {
          break;
        }
        else if (input.equals("sp")) {
          System.out.println("You performed a special attack on the enemy");
          System.out.println( player.specialAttack(enemy));
        }
        else if (input.equals("su")) {
          System.out.println("You healed yourself");
          System.out.println(player.support());
        }
        else if (input.equals("a")) {
          System.out.println("You attack the enemy");
          System.out.println(player.attack(enemy));
        }
        else {
          System.out.println("Not a valid input, type (a)ttack / (sp)ecial / (su)pport / quit");
        }
      } else {
        System.out.println("You lost! The enemy won");
        break;
      }

      if (enemy.getHP() > 0) {
        int random = (int)(Math.random() * 3);
        if (random == 0) {
          System.out.println(enemy.attack(player));
        }
        else if (random == 1) {
          System.out.println(enemy.specialAttack(player));
        }
        else if (random == 2) {
          System.out.println(enemy.support());
        }
      }
      else {
        System.out.println("You won! The enemy is dead");
        break;
      }
    }
  }
}
