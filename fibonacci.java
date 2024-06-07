package Mahim_210303;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter fibonacci number: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(getFibonacciSequence(i) + " ");
        }
        scan.close();
    }

    public static int getFibonacciSequence(int n) {
        if (n <= 1) {
            return n;
        } else {
            return getFibonacciSequence(n - 1) + getFibonacciSequence(n - 2);
        }
    }
}