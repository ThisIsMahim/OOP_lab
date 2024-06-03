package Mahim_210303;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");}
    }
class Cat extends Animal {   
   @Override
    void sound() {
        System.out.println("Cat meows");}
    }
public class overRiding {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Dog(); 
        Animal animal3 = new Cat(); 
        animal1.sound(); 
        animal2.sound(); 
        animal3.sound(); 
    }
}
