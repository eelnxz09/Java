import java.util.LinkedList;

public class LinkedListExampleDemo {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();

        students.add("Rahul");
        students.add("Priya");
        students.add("Amit");
        students.add("Sneha");

        System.out.println("Original LinkedList: " + students);

        students.addFirst("Neha");
        System.out.println("After adding first: " + students);

        students.addLast("Rohan");
        System.out.println("After adding last: " + students);

        students.remove("Amit");
        System.out.println("After removing Amit: " + students);

        if (students.contains("Priya")) {
            System.out.println("Priya is present in the list");
        } else {
            System.out.println("Priya is not present in the list");
        }

        System.out.println("First student: " + students.getFirst());
        System.out.println("Last student: " + students.getLast());
        System.out.println("Total students: " + students.size());

        System.out.print("Student Names: ");
        for (String name : students) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
