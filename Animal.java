public class Animal {
    String species;

    public Animal() {
        System.out.println("Animal: Generic animal created");
    }

    public Animal(String species) {
        this.species = species;
        System.out.println("Animal: Species = " + species);
    }
}
