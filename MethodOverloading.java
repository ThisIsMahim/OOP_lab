package Mahim_210303;

public class MethodOverloading {

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum1 = add(5, 10);
        System.out.println("Sum of two integers: " + sum1);

        int sum2 = add(5, 10, 15);
        System.out.println("Sum of three integers: " + sum2);

        double sum3 = add(2.5, 3.5);
        System.out.println("Sum of two doubles: " + sum3);
    }
}
