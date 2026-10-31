import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array length: " + numbers.length + " (valid indices: 0 to 4)");
        System.out.print("Enter index to access: ");
        int index = sc.nextInt();

        try {
            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index is out of bounds.");
        } finally {
            System.out.println("Finally block executed: Array operation finished.");
            sc.close();
        }
    }
}
