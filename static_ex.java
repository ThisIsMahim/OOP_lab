package Mahim_210303;

public class static_ex {
    static int count = 0;

    static void incrementCount() {
        count++;
    }

    public static void main(String[] args) {
        
        System.out.println("Initial count: " + count);
        
        incrementCount();
        
        System.out.println("Count after increment: " + count);
    }
}

