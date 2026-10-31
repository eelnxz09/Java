class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Code03_CustomExceptionDemo {
    static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is below 18. Not eligible to vote.");
        }
        System.out.println("Eligible to vote.");
    }

    public static void main(String[] args) {
        try {
            checkEligibility(16);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }
    }
}
