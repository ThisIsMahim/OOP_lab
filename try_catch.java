package Mahim_210303;

public class try_catch {
    public static void main(String[] args) {
        try {
            
            int[] numbers = {1, 2, 3};
            System.out.println("Element at index 3: " + numbers[3]); 
        } catch (ArrayIndexOutOfBoundsException e) {
          
            System.out.println("An error occurred: Array index is out of bounds.");
        } finally {
            
            System.out.println("This block is always executed, regardless of whether an exception occurred or not.");
        }
    }
}

