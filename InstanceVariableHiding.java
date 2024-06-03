package Mahim_210303;

class Parent {
    String message = "Hello from Parent";
}

class Child extends Parent {
    String message = "Hello from Child";

    void printMessage() {
        
        System.out.println(super.message); // Prints "Hello from Parent"
        
        System.out.println(message); // Prints "Hello from Child"
    }
}

public class InstanceVariableHiding {
    public static void main(String[] args) {
        Child child = new Child();
        child.printMessage();
    }
}

