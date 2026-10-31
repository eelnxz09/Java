import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Priya");
        students.add("Amit");
        students.add("Sneha");

        System.out.print("Student Names: ");
        for (String name : students) {
            System.out.print(name + " ");
        }

        students.add(2, "Neha");
        System.out.print("\nAfter adding Neha: ");
        System.out.print(students);

        students.remove("Amit");
        System.out.print("\nAfter removing Amit: ");
        System.out.print(students);

        System.out.print("\nEnter name to search: ");
        String name = sc.nextLine();

        if (students.contains(name)) {
            System.out.println("Present");
        } else {
            System.out.println("Absent");
        }

        sc.close();
    }
}
