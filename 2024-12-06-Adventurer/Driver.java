public class Driver {
    public static void main(String[] args) {
        Adventurer a = new Thief("Bob",30);
        System.out.println("Thief Bob");
        System.out.println(a.getSpecialName());
        System.out.println(a.getSpecial());
        System.out.println(a.getSpecialMax());
        
        Adventurer b = new Thief("Elon",30);
        System.out.println("\nThief Elon");
        System.out.println(b.getSpecialName());
        System.out.println(b.getSpecial());
        System.out.println(b.getSpecialMax());


    }
}