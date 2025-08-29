package Exceptions;
// Step 1: Define custom exception

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); // call Exception class constructor
    }
}

public class checkedcustom {
    // Step 2: Method that throws exception
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18 to vote.");
        } else {
            System.out.println("Eligible to vote!");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(21); // will throw exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
