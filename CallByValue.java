package Mahim_210303;
public class CallByValue {
    
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Before calling method: x = " + x);

        // Call the method
        changeValue(x);

        // Value of x remains unchanged after the method call
        System.out.println("After calling method: x = " + x);
    }

    // Method to change the value of a parameter
    public static void changeValue(int value) {
        value = 20;
        System.out.println("Inside method: value = " + value);
    }
}

