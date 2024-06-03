package Mahim_210303;

class CustomException extends Exception {
    
    CustomException(String message) {
        super(message);
    }
}
class Example {

    void checkAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("You must be 18 years or older.");
        } else {
            System.out.println("Age is valid.");}}
        }
public class throw_key{
    public static void main(String[] args) {
        Example example = new Example();
        try {
            example.checkAge(15);
        } catch (CustomException e) {
            System.out.println("Caught an exception: " + e.getMessage());}}
}

