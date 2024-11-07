// speak() is overridden in the child class but not the parent, same with getName()
//Therefore, the String "The Mighty"  is added before the original getName() method
// We see this in speak() as well where the extra two lines of the Bird class are now printed
// The first two constructors work because they are creating an object of the same type
//The third one does not work because an Animal is not necessarily a Bird (Animal does not have all the fields Bird does)
//The last one does work because a Bird is an animal (i.e. Animal has Bird)
public class Driver{
    public static void main(String[] args) {
      Animal dog = new Animal("woof", 1, "Bob");
      dog.speak();
      Animal cat = new Animal("meow", 50, "Calico");
      cat.speak();
      Bird Charlie = new Bird("chirp", 16, "Charlie", 5.6, "green");
      Charlie.speak();
      Animal a1 = new Animal("rawr", 100, "Gramps");
      Bird b1 = new Bird("bark", 56, "Snoopy", 63, "white");
      //Bird b2 = new Animal("moo", 14, "Cow");
      Animal a2 = new Bird("chirpchirp", 2, "Toucannon", 43, "black");
      a1.speak();
      b1.speak();
      a2.speak();
    }
  }