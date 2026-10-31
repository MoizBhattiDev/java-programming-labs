public class Mammal extends Animal {
    String furColor;

    public Mammal() {
        this("Unknown Mammal");
        System.out.println("Mammal: No-arg constructor is invoked");
    }

    public Mammal(String species) {
        super(species);
        System.out.println("Mammal: Species = " + species);
    }
}
