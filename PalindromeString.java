package Mahim_210303;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String palindrome = makePalindrome(input);

        System.out.println("Palindrome of the string: " + palindrome);
        
        scanner.close();
    }
    public static String makePalindrome(String str) {
        StringBuilder palindromeBuilder = new StringBuilder(str);

        for (int i = str.length() - 2; i >= 0; i--) {
            palindromeBuilder.append(str.charAt(i));
        }
        return palindromeBuilder.toString();
    }
}
