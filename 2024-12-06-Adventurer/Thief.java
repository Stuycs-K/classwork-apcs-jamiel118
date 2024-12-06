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
   public void setSpecial(int n); {
     special = n;
   }
   public int getSpecialMax() {
     return specialMax;
   }

}
