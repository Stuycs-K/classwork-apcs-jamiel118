public class Thief extends Adventurer{
  private String specialName = "wit";
  private int specialMax, special = 30;

  //Constructors
  public Thief(String name) {
    super(name);
  }

  public Thief(String name, int hp) {
    super(name,hp);
  }
   //Consumable methods

   public String getSpecialName() {
     return specialName;
   }
   //accessor methods
   public int getSpecial() {
     return special;
   }
   public void setSpecial(int n) {
     special = n;
   }
   public int getSpecialMax() {
     return specialMax;
   }

   //hurt or hinder the target adventurer
  public String attack(Adventurer other) {
    String result = "";
    if (other.getHP() > 0) {
      other.setHP(other.getHP() - 1);
      result += other.getName() + " lost 1 health\n";
    }
    if (other.getHP() == 0) {
      result += other.getName() + " is dead";
    }
    return result;
  }

  //heal or buff the target adventurer
  public String support(Adventurer other) {
    if (other.getHP() != other.getmaxHP()) {
      other.setHP(other.getHP() + 1);
      return other.getName() + " gained 1 health";
    }
    return other.getName() + " is at max health";
  }

  //heal or buff self
  public String support() {
    if (getHP() != getmaxHP()) {
      setHP(getHP() + 1);
      return "You gained 1 health";
    }
    return "You are at max health";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other) {
    String result = "";
    if (other.getHP() > 0 && getSpecial() > 0) {
      other.setHP(other.getHP() - 2);
      setSpecial(getSpecial() - 1);
      result += other.getName() + " lost 2 health, you have " + getSpecial() + getSpecialName() + " points left\n";
    }
    else if (getSpecial() == 0) {
      result += "Not enought" + getSpecialName() + " points";
    }
    if (other.getHP() == 0) {
      result += other.getName() + " is dead";
    }
    return result;
  }

}