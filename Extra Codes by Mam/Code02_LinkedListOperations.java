import java.util.LinkedList;

public class Code02_LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("Token 1");
        queue.offer("Token 2");
        queue.offer("Token 3");

        System.out.println("Queue: " + queue);
        System.out.println("Next to serve (peek): " + queue.peek());
        System.out.println("Served (poll): " + queue.poll());
        System.out.println("Remaining Queue: " + queue);
    }
}
