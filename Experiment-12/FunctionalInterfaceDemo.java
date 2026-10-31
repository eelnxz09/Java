@FunctionalInterface
interface Greeting {
    void greet(String message);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Greeting g = msg -> System.out.println("Greeting: " + msg);
        g.greet("Welcome to Java Functional Interfaces");
    }
}
