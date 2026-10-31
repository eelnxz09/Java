import java.util.Scanner;

public class EvenNumberCheckDemo {
    static void checkEven(int number) throws IllegalArgumentException {
        if (number % 2 != 0) {
            throw new IllegalArgumentException("Number is not even: " + number);
        }
        System.out.println(number + " is an even number.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        try {
            checkEven(num);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
