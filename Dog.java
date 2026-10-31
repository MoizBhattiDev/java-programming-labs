public class Dog extends Mammal {
    String name;
    String breed;

    public Dog() {
        super("Canine");
        System.out.println("Dog: No-arg constructor is invoked");
    }

    public Dog(String name) {
        this();
        this.name = name;
        System.out.println("Dog: Name = " + name);
    }
}
