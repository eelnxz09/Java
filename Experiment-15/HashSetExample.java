import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> students = new HashSet<>();

        students.add("Rahul");
        students.add("Priya");
        students.add("Amit");
        students.add("Sneha");

        System.out.println("Original HashSet: " + students);

        students.add("Rahul");
        System.out.println("After adding duplicate (Rahul): " + students);

        students.remove("Amit");
        System.out.println("After removing Amit: " + students);

        if (students.contains("Priya")) {
            System.out.println("Priya is present in the set");
        } else {
            System.out.println("Priya is absent");
        }

        System.out.println("Total students: " + students.size());
        System.out.println("Student Names: ");
        for (String name : students) {
            System.out.println(name);
        }
    }
}
