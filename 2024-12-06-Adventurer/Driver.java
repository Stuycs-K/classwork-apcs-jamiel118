public class Driver {
    public static void main(String[] args) {
        Adventurer a = new Thief("Bob",30);
        System.out.println("Thief Bob");
        System.out.println(a.getSpecialName());
        System.out.println(a.getSpecial());
        System.out.println(a.getSpecialMax());

        Adventurer b = new Thief("Elon",3);
        System.out.println("\nThief Elon");
        System.out.println(b.getSpecialName());
        System.out.println(b.getSpecial());
        System.out.println(b.getSpecialMax());

        System.out.println("\n" + a.attack(b));
        System.out.println(b.getHP());
        System.out.println(a.specialAttack(b));
        System.out.println(b.getHP());
        System.out.println("Special count: " + a.getSpecial());

        System.out.println("\n" + a.support(b));
        System.out.println(b.getHP());
        System.out.println(a.support(b));
        System.out.println(b.getHP());
        System.out.println(a.support(b));
        System.out.println(b.getHP());
        System.out.println(a.support(b));
        System.out.println(b.getHP());

        a.setSpecial(4000);
        System.out.println("\n" + a.getSpecial());
        a.setSpecial(25);
        System.out.println(a.getSpecial());
    }
}