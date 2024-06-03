package Mahim_210303;

class Animal {
    String species;

    Animal(String species) {
        this.species = species;
    }
    void displaySpecies() {
        System.out.println("Species: " + species);
    }
}
class Dog extends Animal {
    String breed;

    Dog(String species, String breed) {
        super(species); 
        this.breed = breed;
    }

    void displayBreed() {
        System.out.println("Breed: " + breed);
    }

    @Override
    void displaySpecies() {
        super.displaySpecies(); 
        System.out.println("This is a dog.");
    }
}
public class super_keyword{
    public static void main(String[] args) {
        Dog myDog = new Dog("Canine", "Labrador");
        myDog.displaySpecies(); 
        myDog.displayBreed();
    }
}


